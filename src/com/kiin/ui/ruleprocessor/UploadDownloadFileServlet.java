package com.kiin.ui.ruleprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.drools.core.command.impl.GenericCommand;
import org.kie.api.KieServices;
import org.kie.api.command.BatchExecutionCommand;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;
import com.kiin.ui.ruleprocessor.ConfigUtil;
import com.kiin.ui.ruleprocessor.FileContent;
/**
 * A servlet to take a data file, apply rules on it by calling KIE REST API, convert return results into a java object and forward it to another JSP
 * @author kuttik
 *
 */
@WebServlet("/UploadDownloadFileServlet")
public class UploadDownloadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(getClass());
    private ServletFileUpload uploader = null;
    
    KieServicesConfiguration config = null;
    KieServicesClient client = null;
    RuleServicesClient ruleClient = null;
    List<GenericCommand<?>> commands = null;
    String container = null;
    List<FileContent> fileContentArrayList = null;
	@Override
	public void init() throws ServletException{
		/**
		 * Boilerplat for handling uploaded file and KIE server connectivity
		 */
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File filesDir = (File) getServletContext().getAttribute("FILES_DIR_FILE");
		fileFactory.setRepository(filesDir);
		this.uploader = new ServletFileUpload(fileFactory);
		
		
		/**
		 * KIE server connection stuff
		 */
		String url = ConfigUtil.getPropertyByName("SRVR_URL");
		String username = ConfigUtil.getPropertyByName("USERNAME");
		String password = ConfigUtil.getPropertyByName("PASSWORD");
		container = ConfigUtil.getPropertyByName("CONTAINER");		
		
		 config = KieServicesFactory.newRestConfiguration(url, username, password);	
		 config.setMarshallingFormat(MarshallingFormat.XSTREAM);
		 
		client = KieServicesFactory.newKieServicesClient(config);
		ruleClient = client.getServicesClient(RuleServicesClient.class);
		commands = new ArrayList<GenericCommand<?>>();
		fileContentArrayList = new ArrayList<FileContent>();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("fileName");
		if(fileName == null || fileName.equals("")){
			throw new ServletException("File Name can't be null or empty");
		}
		File file = new File(request.getServletContext().getAttribute("FILES_DIR")+File.separator+fileName);
		if(!file.exists()){
			throw new ServletException("File doesn't exists on server.");
		}
		logger.info("File location on server::"+file.getAbsolutePath());
		ServletContext ctx = getServletContext();
		InputStream fis = new FileInputStream(file);
		String mimeType = ctx.getMimeType(file.getAbsolutePath());
		response.setContentType(mimeType != null? mimeType:"application/octet-stream");
		response.setContentLength((int) file.length());
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		ServletOutputStream os       = response.getOutputStream();
		byte[] bufferData = new byte[1024];
		int read=0;
		while((read = fis.read(bufferData))!= -1){
			os.write(bufferData, 0, read);
		}
		os.flush();
		os.close();
		fis.close();
		
		logger.info("File downloaded at client successfully");
	}
	
	/**
	 * The good old way of rendering HTML straight from Servlet stream. Like the old way
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletFileUpload.isMultipartContent(request)){
			throw new ServletException("Content type is not multipart/form-data");
		}		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><head></head><body>");

		
		int cntOfFilesProcessed = 0 ;
		FileContent fileContent = null;
		List<FileContent> returnFileContentArrayList = null;
		
		try {
			List<FileItem> fileItemsList = uploader.parseRequest(request);
			Iterator<FileItem> fileItemsIterator = fileItemsList.iterator();			
			returnFileContentArrayList = new ArrayList<FileContent>();
			
			while(fileItemsIterator.hasNext())
			{						
				FileItem fileItem = fileItemsIterator.next();
				logger.info("FileName="+fileItem.getName());
				logger.info("ContentType="+fileItem.getContentType());
				logger.info("Size in bytes="+fileItem.getSize());
				
				File file = new File(request.getServletContext().getAttribute("FILES_DIR")+File.separator+fileItem.getName());

				fileItem.write(file);
				
				BufferedReader buf = new BufferedReader(new InputStreamReader(fileItem.getInputStream()));
					while (buf.readLine() != null)
					{
						String str = buf.readLine();
						cntOfFilesProcessed = cntOfFilesProcessed+1;
						fileContent = new FileContent();
						 
						String strArr[] = str.split("\t");
						// File has only 49 columns
						if (strArr.length == 0 || strArr.length < 49)
							throw new Exception("file is empty");
						else {
							// Processing only few aspect of the file as it is only a demo
							fileContent.setSite_producer_name(strArr[0]);
							fileContent.setSite_sender_name(strArr[1]);
							fileContent.setOrder_number(strArr[2]);
							fileContent.setOrderer_code(strArr[3]);
							fileContent.setOrderer_group(strArr[4]);
							fileContent.setSample_is_urgent(strArr[5]);
							fileContent.setEvent_datetime(strArr[26]);
							fileContent.setOrderer_functional_unit("");
							fileContent.setSample_id("");
							fileContent.setSample_subtype("");
							fileContent.setSample_rank("");
							fileContent.setSample_is_real("");
							fileContent.setSample_is_aliquot("");
							fileContent.setSample_aliquot_parent_id("");
							fileContent.setSample_type_connection_instrument_code("");
							fileContent.setSample_type("");
							fileContent.setSample_type_label("");
							fileContent.setTube_preanalytical_mpl_link_code("");
							fileContent.setTube_preanalytical_mpl_workcycle("");
							fileContent.setTube_preanalytical_mpl_workplace("");
							fileContent.setParameter_name("");
							fileContent.setParameter_with_sample_type_name("");
							fileContent.setParameter_instrument_connection_code("");
							fileContent.setParameter_lis_connection_code("");
							fileContent.setParameter_discipline_name("");
							fileContent.setParameter_type("");
							fileContent.setEvent_id("");
							fileContent.setEvent_actor("");
							fileContent.setInstrument_name("");
							fileContent.setInstrument_serial_number("");
							fileContent.setInstrument_mpl_number("");
							fileContent.setInstrument_model("");
							fileContent.setInstrument_parent_name("");
							fileContent.setInstrument_connection_driver_type("");
							fileContent.setLis_connection_code("");
							fileContent.setParameter_dimension_1("");
							fileContent.setParameter_dimension_2("");
							fileContent.setParameter_dimension_3("");
							fileContent.setParameter_dimension_4("");
							fileContent.setParameter_dimension_5("");
							fileContent.setInstrument_dimension_1("");
							fileContent.setInstrument_dimension_2("");
							fileContent.setExportation_realisation_date("");
							fileContent.setExportation_date("");
							fileContent.setCustomer_licence_name("");
							fileContent.setMiddleware_network_id("");
							fileContent.setCustomer_contract_isppm("");
							fileContent.setFile_name("");
							
							returnFileContentArrayList.add(validateAgainstRules(fileContent));
							fileContent = null;
						}
						
			}				
			}
			request.setAttribute("data", returnFileContentArrayList.size());
			request.setAttribute("DQPassedData", returnFileContentArrayList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Mapper.jsp");
	         dispatcher.forward(request,response);
		} catch (FileUploadException e) {
			e.printStackTrace();
			out.write("Exception in uploading file.");
		} catch (Exception e) {
			e.printStackTrace();
			out.write("Exception in uploading file.");
		}
		out.write("</body></html>");
	}
	
	private FileContent validateAgainstRules(FileContent fileContent) throws IOException,JAXBException
	{	
		
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newInsert(fileContent,"InputData"));
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newFireAllRules("fire-identifier"));
		BatchExecutionCommand batchCommand = KieServices.Factory.get().getCommands().newBatchExecution(commands);
		ServiceResponse<String> kieresponse = ruleClient.executeCommands(container, batchCommand);

		String output = kieresponse.getResult();
		
		JAXBContext jaxbContext = JAXBContext.newInstance(FileContent.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		//Trimming away unwanted XML to make XML fit for Unmarsheller 
		String textFrom = "<result identifier=\"InputData\">";
		String textTo = "</result>";
		String result =
				output.substring(
						output.indexOf(textFrom) + textFrom.length(),
						output.length());
		
		result =
			      result.substring(
			        0,
			        result.indexOf(textTo));

		// JAXBUnmarsheller adds additional underscore which need to be removed
		CharSequence cs1 = "__";
		if (result.contains(cs1))
			result = result.replaceAll("__", "_");
		
		FileContent fileOut = (FileContent)jaxbUnmarshaller.unmarshal(new StringReader(result));
				
		return fileOut;
	}

}
