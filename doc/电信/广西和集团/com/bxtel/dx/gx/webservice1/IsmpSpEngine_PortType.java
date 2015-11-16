/**
 * IsmpSpEngine_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

public interface IsmpSpEngine_PortType extends java.rmi.Remote {
    public com.bxtel.dx.gx.webservice1.Response orderRelationUpdateNotify(com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq) throws java.rmi.RemoteException;
    public com.bxtel.dx.gx.webservice1.Response serviceConsumeNotify(com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq serviceConsumeNotifyReqPara) throws java.rmi.RemoteException;
    public com.bxtel.dx.gx.webservice1.Response spWithdrawSubscription(com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq spWithdrawSubscriptionReqPara) throws java.rmi.RemoteException;
    public com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp notifyManagementInfo(com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq notifyManagementInfoReq) throws java.rmi.RemoteException;
}
