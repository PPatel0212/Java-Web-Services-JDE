package be.e1.bssv.J563004.ecoproxy;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Fri Jan 17 16:26:00 EST 2014  
 */

public interface Processecnnotification_Client_Ep extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: ProcessECNNotification_Pt  
     // Port Type: ProcessECNNotification   
     //***********************************
     
  /**
   * returns ProcessECNNotification_Pt port in this service 
   */
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt() throws javax.xml.rpc.ServiceException;

  /**
   * @Deprecated Use getProcessECNNotification_Pt(byte[] username, byte[] password);
   */
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(String username, String password) throws javax.xml.rpc.ServiceException;

  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
      be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(java.io.InputStream policyInputStream) throws javax.xml.rpc.ServiceException;  
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(java.io.InputStream policyInputStream, boolean inbound, boolean outbound) throws javax.xml.rpc.ServiceException;
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(String operationName, 
    java.util.Set<java.io.InputStream> inbound, java.util.Set<java.io.InputStream> outbound) throws javax.xml.rpc.ServiceException;
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(String operationName,
    java.io.InputStream[] inbound, java.io.InputStream[] outbound) throws javax.xml.rpc.ServiceException;
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt( 
    java.util.Set<java.io.InputStream> inbound, java.util.Set<java.io.InputStream> outbound) throws javax.xml.rpc.ServiceException;
  be.e1.bssv.J563004.ecoproxy.ProcessECNNotification getProcessECNNotification_Pt(
    java.io.InputStream[] inbound, java.io.InputStream[] outbound) throws javax.xml.rpc.ServiceException;
       
  }