package be.e1.bssv.J560201.proxy;

/**
 * Generated interface, do not edit.
 *
 * This stub interface was generated by weblogic
 * webservice stub gen on Mon Nov 05 16:22:30 EST 2012  
 */

public interface ProcessApprovalGateway extends java.rmi.Remote {
     
  /**
   * Operation Name : {http://xmlns.oracle.com/ApprovalGatewayManager/ApprovalGateway/ProcessApprovalGateway}process   */

  public be.e1.bssv.J560201.com.beaerospace.approvalgateway.ApprovalGatewayReply process(be.e1.bssv.J560201.com.beaerospace.approvalgateway.ApprovalGatewayRequest payload) throws java.rmi.RemoteException;
    public void processAsync(weblogic.wsee.async.AsyncPreCallContext apc, be.e1.bssv.J560201.com.beaerospace.approvalgateway.ApprovalGatewayRequest payload) throws java.rmi.RemoteException ;
  
}