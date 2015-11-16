/**
 * IsmpSpEngineSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

public class IsmpSpEngineSoapBindingSkeleton implements com.bxtel.dx.gx.webservice1.IsmpSpEngine_PortType, org.apache.axis.wsdl.Skeleton {
    private com.bxtel.dx.gx.webservice1.IsmpSpEngine_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "orderRelationUpdateNotifyReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "OrderRelationUpdateNotifyReq"), com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("orderRelationUpdateNotify", _params, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "orderRelationUpdateNotifyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "orderRelationUpdateNotify"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("orderRelationUpdateNotify") == null) {
            _myOperations.put("orderRelationUpdateNotify", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("orderRelationUpdateNotify")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "spWithdrawSubscriptionReqPara"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPWithdrawSubscriptionReq"), com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("spWithdrawSubscription", _params, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "spWithdrawSubscriptionReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "spWithdrawSubscription"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("spWithdrawSubscription") == null) {
            _myOperations.put("spWithdrawSubscription", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("spWithdrawSubscription")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "serviceConsumeNotifyReqPara"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "ServiceConsumeNotifyReq"), com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("serviceConsumeNotify", _params, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "serviceConsumeNotifyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "serviceConsumeNotify"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("serviceConsumeNotify") == null) {
            _myOperations.put("serviceConsumeNotify", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("serviceConsumeNotify")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "notifyManagementInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "NotifyManagementInfoReq"), com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("notifyManagementInfo", _params, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "notifyManagementInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "NotifyManagementInfoRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "notifyManagementInfo"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("notifyManagementInfo") == null) {
            _myOperations.put("notifyManagementInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("notifyManagementInfo")).add(_oper);
    }

    public IsmpSpEngineSoapBindingSkeleton() {
        this.impl = new com.bxtel.dx.gx.webservice1.IsmpSpEngineSoapBindingImpl();
    }

    public IsmpSpEngineSoapBindingSkeleton(com.bxtel.dx.gx.webservice1.IsmpSpEngine_PortType impl) {
        this.impl = impl;
    }
    public com.bxtel.dx.gx.webservice1.Response orderRelationUpdateNotify(com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq) throws java.rmi.RemoteException
    {
        com.bxtel.dx.gx.webservice1.Response ret = impl.orderRelationUpdateNotify(orderRelationUpdateNotifyReq);
        return ret;
    }

    public com.bxtel.dx.gx.webservice1.Response spWithdrawSubscription(com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq spWithdrawSubscriptionReqPara) throws java.rmi.RemoteException
    {
        com.bxtel.dx.gx.webservice1.Response ret = impl.spWithdrawSubscription(spWithdrawSubscriptionReqPara);
        return ret;
    }

    public com.bxtel.dx.gx.webservice1.Response serviceConsumeNotify(com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq serviceConsumeNotifyReqPara) throws java.rmi.RemoteException
    {
        com.bxtel.dx.gx.webservice1.Response ret = impl.serviceConsumeNotify(serviceConsumeNotifyReqPara);
        return ret;
    }

    public com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp notifyManagementInfo(com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq notifyManagementInfoReq) throws java.rmi.RemoteException
    {
        com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp ret = impl.notifyManagementInfo(notifyManagementInfoReq);
        return ret;
    }

}
