/**
 * IsmpSpEngineSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

import com.bxtel.bxdatadxgxdg.bo.BxDataDxGxDgTBO;
import com.bxtel.util.SpringContextHolder;

public class IsmpSpEngineSoapBindingImpl implements com.bxtel.dx.gx.webservice1.IsmpSpEngine_PortType{
    public com.bxtel.dx.gx.webservice1.Response orderRelationUpdateNotify(com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq) throws java.rmi.RemoteException {
    	BxDataDxGxDgTBO dxgxbo=SpringContextHolder.getApplicationContext().getBean(com.bxtel.bxdatadxgxdg.bo.BxDataDxGxDgTBO.class);
    	System.out.println(dxgxbo);
    	return null;
    }
    
    public com.bxtel.dx.gx.webservice1.Response spWithdrawSubscription(com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq spWithdrawSubscriptionReqPara) throws java.rmi.RemoteException {
        return null;
    }

    public com.bxtel.dx.gx.webservice1.Response serviceConsumeNotify(com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq serviceConsumeNotifyReqPara) throws java.rmi.RemoteException {
        return null;
    }

    public com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp notifyManagementInfo(com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq notifyManagementInfoReq) throws java.rmi.RemoteException {
        return null;
    }

}
