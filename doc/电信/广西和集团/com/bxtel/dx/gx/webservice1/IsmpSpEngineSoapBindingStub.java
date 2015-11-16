/**
 * IsmpSpEngineSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

public class IsmpSpEngineSoapBindingStub extends org.apache.axis.client.Stub implements com.bxtel.dx.gx.webservice1.IsmpSpEngine_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderRelationUpdateNotify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "orderRelationUpdateNotifyReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "OrderRelationUpdateNotifyReq"), com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        oper.setReturnClass(com.bxtel.dx.gx.webservice1.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "orderRelationUpdateNotifyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("spWithdrawSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "spWithdrawSubscriptionReqPara"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPWithdrawSubscriptionReq"), com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        oper.setReturnClass(com.bxtel.dx.gx.webservice1.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "spWithdrawSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceConsumeNotify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "serviceConsumeNotifyReqPara"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "ServiceConsumeNotifyReq"), com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response"));
        oper.setReturnClass(com.bxtel.dx.gx.webservice1.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "serviceConsumeNotifyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notifyManagementInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "notifyManagementInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "NotifyManagementInfoReq"), com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "NotifyManagementInfoRsp"));
        oper.setReturnClass(com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com", "notifyManagementInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public IsmpSpEngineSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IsmpSpEngineSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IsmpSpEngineSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "NotifyManagementInfoReq");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "OrderRelationUpdateNotifyReq");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "ServiceConsumeNotifyReq");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPWithdrawSubscriptionReq");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "NotifyManagementInfoRsp");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.sp.ismp.chinatelecom.com", "Response");
            cachedSerQNames.add(qName);
            cls = com.bxtel.dx.gx.webservice1.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.bxtel.dx.gx.webservice1.Response orderRelationUpdateNotify(com.bxtel.dx.gx.webservice1.OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "orderRelationUpdateNotify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderRelationUpdateNotifyReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bxtel.dx.gx.webservice1.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bxtel.dx.gx.webservice1.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.bxtel.dx.gx.webservice1.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bxtel.dx.gx.webservice1.Response spWithdrawSubscription(com.bxtel.dx.gx.webservice1.SPWithdrawSubscriptionReq spWithdrawSubscriptionReqPara) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "spWithdrawSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {spWithdrawSubscriptionReqPara});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bxtel.dx.gx.webservice1.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bxtel.dx.gx.webservice1.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.bxtel.dx.gx.webservice1.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bxtel.dx.gx.webservice1.Response serviceConsumeNotify(com.bxtel.dx.gx.webservice1.ServiceConsumeNotifyReq serviceConsumeNotifyReqPara) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "serviceConsumeNotify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceConsumeNotifyReqPara});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bxtel.dx.gx.webservice1.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bxtel.dx.gx.webservice1.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.bxtel.dx.gx.webservice1.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp notifyManagementInfo(com.bxtel.dx.gx.webservice1.NotifyManagementInfoReq notifyManagementInfoReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notifyManagementInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {notifyManagementInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp) org.apache.axis.utils.JavaUtils.convert(_resp, com.bxtel.dx.gx.webservice1.NotifyManagementInfoRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
