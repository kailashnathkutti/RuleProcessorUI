<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div.fileinputs {
	position: relative;
}

div.fakefile {
	position: absolute;
	top: 0px;
	left: 0px;
	z-index: 1;
}

input.file {
	position: relative;
	text-align: right;
	-moz-opacity:0 ;
	filter:alpha(opacity: 0);
	opacity: 0;
	z-index: 2;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File processor</title>
</head>

<body  >
<div class="fileinputs">
<h4>Upload a data file</h4>
</div>
<br>
<form action="UploadDownloadFileServlet" method="post" enctype="multipart/form-data">Select File to Upload:<input type="file" name="fileName" id="file"  >
<br><br>
<input type="submit" value="Upload" for="file" >
</form>


</body>
</html>