package be.e1.bssv.J564200.ProcessProxy;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Wed Mar 12 00:39:08 EDT 2014 */

public class Fedexshipmentrequest_Client_Ep_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements be.e1.bssv.J564200.ProcessProxy.Fedexshipmentrequest_Client_Ep {

  public Fedexshipmentrequest_Client_Ep_Impl() throws javax.xml.rpc.ServiceException {
    this("be/e1/bssv/J564200/ProcessProxy/Fedexshipmentrequest_Client_Ep_saved_wsdl.wsdl", null);
  }
  
  public Fedexshipmentrequest_Client_Ep_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public Fedexshipmentrequest_Client_Ep_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://xmlns.oracle.com/FedExShipServices/FedExShipments/fedExShipmentRequest", "fedexshipmentrequest_client_ep"),
          "be/e1/bssv/J564200/ProcessProxy/Fedexshipmentrequest_Client_Ep_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: FedExShipmentRequest_Pt 
  // Port Type: FedExShipmentRequest 
  //***********************************

  be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest mvar_FedExShipmentRequest_Pt;

  /**
   * returns FedExShipmentRequest_Pt port in this service 
   */
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_FedExShipmentRequest_Pt == null) {
      mvar_FedExShipmentRequest_Pt =
        new be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest_Stub(_getPort("fedExShipmentRequest_pt"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_FedExShipmentRequest_Pt)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_FedExShipmentRequest_Pt;
  }

  /**
   * @Deprecated  Use getFedExShipmentRequest_Pt(byte[] username, byte[] password)
   */
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getFedExShipmentRequest_Pt();
  }

  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getFedExShipmentRequest_Pt();
  }
  
      public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    java.io.InputStream policyInputStream) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", policyInputStream, true, true);
    return getFedExShipmentRequest_Pt();
  }

  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    java.io.InputStream policyInputStream, 
    boolean inbound, 
    boolean outbound) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", policyInputStream, inbound, outbound);
    return getFedExShipmentRequest_Pt();
  }
 
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", null, inboundPolicies, outboundPolicies);
    return getFedExShipmentRequest_Pt();
  }
  
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", null, inboundPolicies, outboundPolicies);
    return getFedExShipmentRequest_Pt();
  }
  
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    String operationName,
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", operationName, inboundPolicies, outboundPolicies);
    return getFedExShipmentRequest_Pt();
  }
  
  public be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequest getFedExShipmentRequest_Pt(
    String operationName,
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("fedExShipmentRequest_pt", operationName, inboundPolicies, outboundPolicies);
    return getFedExShipmentRequest_Pt();
  }
    
}