package com.kiin.ui.ruleprocessor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class was automatically generated by the data modeler tool.
 * XML annotations are manually added so that XML Unmarsheller can process it easily
 */
@XmlRootElement(name = "com.kiin.ui.ruleprocessor.FileContent")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class FileContent implements java.io.Serializable {

   static final long serialVersionUID = 1L;
   private java.lang.String site_producer_name;
   private java.lang.String site_sender_name;
   private java.lang.String order_number;
   private java.lang.String orderer_code;
   private java.lang.String orderer_group;
   private java.lang.String orderer_functional_unit;  
   private java.lang.String sample_id;
   private java.lang.String sample_subtype;
   private java.lang.String sample_rank;
   private java.lang.String sample_is_urgent;
   private java.lang.String sample_is_real;
   private java.lang.String sample_is_aliquot;
   private java.lang.String sample_aliquot_parent_id;
   private java.lang.String sample_type_connection_instrument_code;
   private java.lang.String sample_type;
   private java.lang.String sample_type_label;
   private java.lang.String tube_preanalytical_mpl_link_code;
   private java.lang.String tube_preanalytical_mpl_workcycle;
   private java.lang.String tube_preanalytical_mpl_workplace;
   private java.lang.String parameter_name;
   private java.lang.String parameter_with_sample_type_name;
   private java.lang.String parameter_instrument_connection_code;
   private java.lang.String parameter_lis_connection_code;
   private java.lang.String parameter_discipline_name;
   private java.lang.String parameter_type;
   private java.lang.String event_id;
   private java.lang.String event_datetime;
   private java.lang.String event_actor;
   private java.lang.String instrument_name;
   private java.lang.String instrument_serial_number;
   private java.lang.String instrument_mpl_number;
   private java.lang.String instrument_model;
   private java.lang.String instrument_parent_name;
   private java.lang.String instrument_connection_driver_type;
   private java.lang.String lis_connection_code;
   private java.lang.String parameter_dimension_1;
   private java.lang.String parameter_dimension_2;
   private java.lang.String parameter_dimension_3;
   private java.lang.String parameter_dimension_4;
   private java.lang.String parameter_dimension_5;
   private java.lang.String instrument_dimension_1;
   private java.lang.String instrument_dimension_2;
   private java.lang.String exportation_realisation_date;
   private java.lang.String exportation_date;
   private java.lang.String customer_licence_name;
   private java.lang.String middleware_network_id;
   private java.lang.String customer_contract_isppm;
   private java.lang.String file_name;

   @org.kie.api.definition.type.Label(value = "Indicator for dq1 rules pass")
   private boolean dq1_passed;

   @org.kie.api.definition.type.Label(value = "Indicator for dq2 rules pass")
   private boolean dq2_passed;

   @org.kie.api.definition.type.Label(value = "Indicator for dq4 rules pass")
   private boolean dq4_passed;

   @org.kie.api.definition.type.Label(value = "Indicator for dq3 rules pass")
   private boolean dq3_passed;
   
   private boolean valid = true;
   
   public boolean isValid()
   {
      return this.valid;
   }

   public void setValid(boolean valid)
   {
      this.valid = valid;
   }
   
    public FileContent() {
    }
    public java.lang.String getSite_producer_name()
   {
      return this.site_producer_name;
   }

   public void setSite_producer_name(java.lang.String site_producer_name)
   {
      this.site_producer_name = site_producer_name;
   }

   public java.lang.String getSite_sender_name()
   {
      return this.site_sender_name;
   }

   public void setSite_sender_name(java.lang.String site_sender_name)
   {
      this.site_sender_name = site_sender_name;
   }

   public java.lang.String getOrder_number()
   {
      return this.order_number;
   }

   public void setOrder_number(java.lang.String order_number)
   {
      this.order_number = order_number;
   }

   public java.lang.String getOrderer_code()
   {
      return this.orderer_code;
   }

   public void setOrderer_code(java.lang.String orderer_code)
   {
      this.orderer_code = orderer_code;
   }

   public java.lang.String getOrderer_group()
   {
      return this.orderer_group;
   }

   public void setOrderer_group(java.lang.String orderer_group)
   {
      this.orderer_group = orderer_group;
   }

   public java.lang.String getOrderer_functional_unit()
   {
      return this.orderer_functional_unit;
   }

   public void setOrderer_functional_unit(
         java.lang.String orderer_functional_unit)
   {
      this.orderer_functional_unit = orderer_functional_unit;
   }

   public java.lang.String getSample_id()
   {
      return this.sample_id;
   }

   public void setSample_id(java.lang.String sample_id)
   {
      this.sample_id = sample_id;
   }

   public java.lang.String getSample_subtype()
   {
      return this.sample_subtype;
   }

   public void setSample_subtype(java.lang.String sample_subtype)
   {
      this.sample_subtype = sample_subtype;
   }

   public java.lang.String getSample_rank()
   {
      return this.sample_rank;
   }

   public void setSample_rank(java.lang.String sample_rank)
   {
      this.sample_rank = sample_rank;
   }

   public java.lang.String getSample_is_urgent()
   {
      return this.sample_is_urgent;
   }

   public void setSample_is_urgent(java.lang.String sample_is_urgent)
   {
      this.sample_is_urgent = sample_is_urgent;
   }

   public java.lang.String getSample_is_real()
   {
      return this.sample_is_real;
   }

   public void setSample_is_real(java.lang.String sample_is_real)
   {
      this.sample_is_real = sample_is_real;
   }

   public java.lang.String getSample_is_aliquot()
   {
      return this.sample_is_aliquot;
   }

   public void setSample_is_aliquot(java.lang.String sample_is_aliquot)
   {
      this.sample_is_aliquot = sample_is_aliquot;
   }

   public java.lang.String getSample_aliquot_parent_id()
   {
      return this.sample_aliquot_parent_id;
   }

   public void setSample_aliquot_parent_id(
         java.lang.String sample_aliquot_parent_id)
   {
      this.sample_aliquot_parent_id = sample_aliquot_parent_id;
   }

   public java.lang.String getSample_type_connection_instrument_code()
   {
      return this.sample_type_connection_instrument_code;
   }

   public void setSample_type_connection_instrument_code(
         java.lang.String sample_type_connection_instrument_code)
   {
      this.sample_type_connection_instrument_code = sample_type_connection_instrument_code;
   }

   public java.lang.String getSample_type()
   {
      return this.sample_type;
   }

   public void setSample_type(java.lang.String sample_type)
   {
      this.sample_type = sample_type;
   }

   public java.lang.String getSample_type_label()
   {
      return this.sample_type_label;
   }

   public void setSample_type_label(java.lang.String sample_type_label)
   {
      this.sample_type_label = sample_type_label;
   }

   public java.lang.String getTube_preanalytical_mpl_link_code()
   {
      return this.tube_preanalytical_mpl_link_code;
   }

   public void setTube_preanalytical_mpl_link_code(
         java.lang.String tube_preanalytical_mpl_link_code)
   {
      this.tube_preanalytical_mpl_link_code = tube_preanalytical_mpl_link_code;
   }

   public java.lang.String getTube_preanalytical_mpl_workcycle()
   {
      return this.tube_preanalytical_mpl_workcycle;
   }

   public void setTube_preanalytical_mpl_workcycle(
         java.lang.String tube_preanalytical_mpl_workcycle)
   {
      this.tube_preanalytical_mpl_workcycle = tube_preanalytical_mpl_workcycle;
   }

   public java.lang.String getTube_preanalytical_mpl_workplace()
   {
      return this.tube_preanalytical_mpl_workplace;
   }

   public void setTube_preanalytical_mpl_workplace(
         java.lang.String tube_preanalytical_mpl_workplace)
   {
      this.tube_preanalytical_mpl_workplace = tube_preanalytical_mpl_workplace;
   }

   public java.lang.String getParameter_name()
   {
      return this.parameter_name;
   }

   public void setParameter_name(java.lang.String parameter_name)
   {
      this.parameter_name = parameter_name;
   }

   public java.lang.String getParameter_with_sample_type_name()
   {
      return this.parameter_with_sample_type_name;
   }

   public void setParameter_with_sample_type_name(
         java.lang.String parameter_with_sample_type_name)
   {
      this.parameter_with_sample_type_name = parameter_with_sample_type_name;
   }

   public java.lang.String getParameter_instrument_connection_code()
   {
      return this.parameter_instrument_connection_code;
   }

   public void setParameter_instrument_connection_code(
         java.lang.String parameter_instrument_connection_code)
   {
      this.parameter_instrument_connection_code = parameter_instrument_connection_code;
   }

   public java.lang.String getParameter_lis_connection_code()
   {
      return this.parameter_lis_connection_code;
   }

   public void setParameter_lis_connection_code(
         java.lang.String parameter_lis_connection_code)
   {
      this.parameter_lis_connection_code = parameter_lis_connection_code;
   }

   public java.lang.String getParameter_discipline_name()
   {
      return this.parameter_discipline_name;
   }

   public void setParameter_discipline_name(
         java.lang.String parameter_discipline_name)
   {
      this.parameter_discipline_name = parameter_discipline_name;
   }

   public java.lang.String getParameter_type()
   {
      return this.parameter_type;
   }

   public void setParameter_type(java.lang.String parameter_type)
   {
      this.parameter_type = parameter_type;
   }

   public java.lang.String getEvent_id()
   {
      return this.event_id;
   }

   public void setEvent_id(java.lang.String event_id)
   {
      this.event_id = event_id;
   }

   public java.lang.String getEvent_datetime()
   {
      return this.event_datetime;
   }

   public void setEvent_datetime(java.lang.String event_datetime)
   {
      this.event_datetime = event_datetime;
   }

   public java.lang.String getEvent_actor()
   {
      return this.event_actor;
   }

   public void setEvent_actor(java.lang.String event_actor)
   {
      this.event_actor = event_actor;
   }

   public java.lang.String getInstrument_name()
   {
      return this.instrument_name;
   }

   public void setInstrument_name(java.lang.String instrument_name)
   {
      this.instrument_name = instrument_name;
   }

   public java.lang.String getInstrument_serial_number()
   {
      return this.instrument_serial_number;
   }

   public void setInstrument_serial_number(
         java.lang.String instrument_serial_number)
   {
      this.instrument_serial_number = instrument_serial_number;
   }

   public java.lang.String getInstrument_mpl_number()
   {
      return this.instrument_mpl_number;
   }

   public void setInstrument_mpl_number(java.lang.String instrument_mpl_number)
   {
      this.instrument_mpl_number = instrument_mpl_number;
   }

   public java.lang.String getInstrument_model()
   {
      return this.instrument_model;
   }

   public void setInstrument_model(java.lang.String instrument_model)
   {
      this.instrument_model = instrument_model;
   }

   public java.lang.String getInstrument_parent_name()
   {
      return this.instrument_parent_name;
   }

   public void setInstrument_parent_name(
         java.lang.String instrument_parent_name)
   {
      this.instrument_parent_name = instrument_parent_name;
   }

   public java.lang.String getInstrument_connection_driver_type()
   {
      return this.instrument_connection_driver_type;
   }

   public void setInstrument_connection_driver_type(
         java.lang.String instrument_connection_driver_type)
   {
      this.instrument_connection_driver_type = instrument_connection_driver_type;
   }

   public java.lang.String getLis_connection_code()
   {
      return this.lis_connection_code;
   }

   public void setLis_connection_code(java.lang.String lis_connection_code)
   {
      this.lis_connection_code = lis_connection_code;
   }

   public java.lang.String getParameter_dimension_1()
   {
      return this.parameter_dimension_1;
   }

   public void setParameter_dimension_1(java.lang.String parameter_dimension_1)
   {
      this.parameter_dimension_1 = parameter_dimension_1;
   }

   public java.lang.String getParameter_dimension_2()
   {
      return this.parameter_dimension_2;
   }

   public void setParameter_dimension_2(java.lang.String parameter_dimension_2)
   {
      this.parameter_dimension_2 = parameter_dimension_2;
   }

   public java.lang.String getParameter_dimension_3()
   {
      return this.parameter_dimension_3;
   }

   public void setParameter_dimension_3(java.lang.String parameter_dimension_3)
   {
      this.parameter_dimension_3 = parameter_dimension_3;
   }

   public java.lang.String getParameter_dimension_4()
   {
      return this.parameter_dimension_4;
   }

   public void setParameter_dimension_4(java.lang.String parameter_dimension_4)
   {
      this.parameter_dimension_4 = parameter_dimension_4;
   }

   public java.lang.String getParameter_dimension_5()
   {
      return this.parameter_dimension_5;
   }

   public void setParameter_dimension_5(java.lang.String parameter_dimension_5)
   {
      this.parameter_dimension_5 = parameter_dimension_5;
   }

   public java.lang.String getInstrument_dimension_1()
   {
      return this.instrument_dimension_1;
   }

   public void setInstrument_dimension_1(
         java.lang.String instrument_dimension_1)
   {
      this.instrument_dimension_1 = instrument_dimension_1;
   }

   public java.lang.String getInstrument_dimension_2()
   {
      return this.instrument_dimension_2;
   }

   public void setInstrument_dimension_2(
         java.lang.String instrument_dimension_2)
   {
      this.instrument_dimension_2 = instrument_dimension_2;
   }

   public java.lang.String getExportation_realisation_date()
   {
      return this.exportation_realisation_date;
   }

   public void setExportation_realisation_date(
         java.lang.String exportation_realisation_date)
   {
      this.exportation_realisation_date = exportation_realisation_date;
   }

   public java.lang.String getExportation_date()
   {
      return this.exportation_date;
   }

   public void setExportation_date(java.lang.String exportation_date)
   {
      this.exportation_date = exportation_date;
   }

   public java.lang.String getCustomer_licence_name()
   {
      return this.customer_licence_name;
   }

   public void setCustomer_licence_name(java.lang.String customer_licence_name)
   {
      this.customer_licence_name = customer_licence_name;
   }

   public java.lang.String getMiddleware_network_id()
   {
      return this.middleware_network_id;
   }

   public void setMiddleware_network_id(java.lang.String middleware_network_id)
   {
      this.middleware_network_id = middleware_network_id;
   }

   public java.lang.String getCustomer_contract_isppm()
   {
      return this.customer_contract_isppm;
   }

   public void setCustomer_contract_isppm(
         java.lang.String customer_contract_isppm)
   {
      this.customer_contract_isppm = customer_contract_isppm;
   }

   public java.lang.String getFile_name()
   {
      return this.file_name;
   }

   public void setFile_name(java.lang.String file_name)
   {
      this.file_name = file_name;
   }

   public boolean isDq1_passed()
   {
      return this.dq1_passed;
   }

   public void setDq1_passed(boolean dq1_passed)
   {
      this.dq1_passed = dq1_passed;
   }

   public boolean isDq2_passed()
   {
      return this.dq2_passed;
   }

   public void setDq2_passed(boolean dq2_passed)
   {
      this.dq2_passed = dq2_passed;
   }

   public boolean isDq4_passed()
   {
      return this.dq4_passed;
   }

   public void setDq4_passed(boolean dq4_passed)
   {
      this.dq4_passed = dq4_passed;
   }

   public boolean isDq3_passed()
   {
      return this.dq3_passed;
   }

   public void setDq3_passed(boolean dq3_passed)
   {
      this.dq3_passed = dq3_passed;
   }

   public FileContent(java.lang.String site_producer_name,
         java.lang.String site_sender_name, java.lang.String order_number,
         java.lang.String orderer_code, java.lang.String orderer_group,
         java.lang.String orderer_functional_unit, java.lang.String sample_id,
         java.lang.String sample_subtype, java.lang.String sample_rank,
         java.lang.String sample_is_urgent, java.lang.String sample_is_real,
         java.lang.String sample_is_aliquot,
         java.lang.String sample_aliquot_parent_id,
         java.lang.String sample_type_connection_instrument_code,
         java.lang.String sample_type, java.lang.String sample_type_label,
         java.lang.String tube_preanalytical_mpl_link_code,
         java.lang.String tube_preanalytical_mpl_workcycle,
         java.lang.String tube_preanalytical_mpl_workplace,
         java.lang.String parameter_name,
         java.lang.String parameter_with_sample_type_name,
         java.lang.String parameter_instrument_connection_code,
         java.lang.String parameter_lis_connection_code,
         java.lang.String parameter_discipline_name,
         java.lang.String parameter_type, java.lang.String event_id,
         java.lang.String event_datetime, java.lang.String event_actor,
         java.lang.String instrument_name,
         java.lang.String instrument_serial_number,
         java.lang.String instrument_mpl_number,
         java.lang.String instrument_model,
         java.lang.String instrument_parent_name,
         java.lang.String instrument_connection_driver_type,
         java.lang.String lis_connection_code,
         java.lang.String parameter_dimension_1,
         java.lang.String parameter_dimension_2,
         java.lang.String parameter_dimension_3,
         java.lang.String parameter_dimension_4,
         java.lang.String parameter_dimension_5,
         java.lang.String instrument_dimension_1,
         java.lang.String instrument_dimension_2,
         java.lang.String exportation_realisation_date,
         java.lang.String exportation_date,
         java.lang.String customer_licence_name,
         java.lang.String middleware_network_id,
         java.lang.String customer_contract_isppm, java.lang.String file_name,
         boolean dq1_passed, boolean dq2_passed, boolean dq4_passed,
         boolean dq3_passed, boolean valid)
   {
      this.site_producer_name = site_producer_name;
      this.site_sender_name = site_sender_name;
      this.order_number = order_number;
      this.orderer_code = orderer_code;
      this.orderer_group = orderer_group;
      this.orderer_functional_unit = orderer_functional_unit;
      this.sample_id = sample_id;
      this.sample_subtype = sample_subtype;
      this.sample_rank = sample_rank;
      this.sample_is_urgent = sample_is_urgent;
      this.sample_is_real = sample_is_real;
      this.sample_is_aliquot = sample_is_aliquot;
      this.sample_aliquot_parent_id = sample_aliquot_parent_id;
      this.sample_type_connection_instrument_code = sample_type_connection_instrument_code;
      this.sample_type = sample_type;
      this.sample_type_label = sample_type_label;
      this.tube_preanalytical_mpl_link_code = tube_preanalytical_mpl_link_code;
      this.tube_preanalytical_mpl_workcycle = tube_preanalytical_mpl_workcycle;
      this.tube_preanalytical_mpl_workplace = tube_preanalytical_mpl_workplace;
      this.parameter_name = parameter_name;
      this.parameter_with_sample_type_name = parameter_with_sample_type_name;
      this.parameter_instrument_connection_code = parameter_instrument_connection_code;
      this.parameter_lis_connection_code = parameter_lis_connection_code;
      this.parameter_discipline_name = parameter_discipline_name;
      this.parameter_type = parameter_type;
      this.event_id = event_id;
      this.event_datetime = event_datetime;
      this.event_actor = event_actor;
      this.instrument_name = instrument_name;
      this.instrument_serial_number = instrument_serial_number;
      this.instrument_mpl_number = instrument_mpl_number;
      this.instrument_model = instrument_model;
      this.instrument_parent_name = instrument_parent_name;
      this.instrument_connection_driver_type = instrument_connection_driver_type;
      this.lis_connection_code = lis_connection_code;
      this.parameter_dimension_1 = parameter_dimension_1;
      this.parameter_dimension_2 = parameter_dimension_2;
      this.parameter_dimension_3 = parameter_dimension_3;
      this.parameter_dimension_4 = parameter_dimension_4;
      this.parameter_dimension_5 = parameter_dimension_5;
      this.instrument_dimension_1 = instrument_dimension_1;
      this.instrument_dimension_2 = instrument_dimension_2;
      this.exportation_realisation_date = exportation_realisation_date;
      this.exportation_date = exportation_date;
      this.customer_licence_name = customer_licence_name;
      this.middleware_network_id = middleware_network_id;
      this.customer_contract_isppm = customer_contract_isppm;
      this.file_name = file_name;
      this.dq1_passed = dq1_passed;
      this.dq2_passed = dq2_passed;
      this.dq4_passed = dq4_passed;
      this.dq3_passed = dq3_passed;
      this.valid = valid;
   }
}