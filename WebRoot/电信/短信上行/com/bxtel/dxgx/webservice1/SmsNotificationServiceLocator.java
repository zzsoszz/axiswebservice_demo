/**
 * SmsNotificationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dxgx.webservice1;

public class SmsNotificationServiceLocator extends org.apache.axis.client.Service implements com.bxtel.dxgx.webservice1.SmsNotificationService {

    public SmsNotificationServiceLocator() {
    }


    public SmsNotificationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SmsNotificationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SmsNotification
    private java.lang.String SmsNotification_address = "http://localhost:9080/SmsNotificationService/services/SmsNotification";

    public java.lang.String getSmsNotificationAddress() {
        return SmsNotification_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SmsNotificationWSDDServiceName = "SmsNotification";

    public java.lang.String getSmsNotificationWSDDServiceName() {
        return SmsNotificationWSDDServiceName;
    }

    public void setSmsNotificationWSDDServiceName(java.lang.String name) {
        SmsNotificationWSDDServiceName = name;
    }

    public com.bxtel.dxgx.webservice1.SmsNotification_PortType getSmsNotification() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SmsNotification_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSmsNotification(endpoint);
    }

    public com.bxtel.dxgx.webservice1.SmsNotification_PortType getSmsNotification(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bxtel.dxgx.webservice1.SmsNotificationBindingStub _stub = new com.bxtel.dxgx.webservice1.SmsNotificationBindingStub(portAddress, this);
            _stub.setPortName(getSmsNotificationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSmsNotificationEndpointAddress(java.lang.String address) {
        SmsNotification_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bxtel.dxgx.webservice1.SmsNotification_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bxtel.dxgx.webservice1.SmsNotificationBindingStub _stub = new com.bxtel.dxgx.webservice1.SmsNotificationBindingStub(new java.net.URL(SmsNotification_address), this);
                _stub.setPortName(getSmsNotificationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SmsNotification".equals(inputPortName)) {
            return getSmsNotification();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.chinatelecom.com.cn/wsdl/ctcc/sms/notification/v2_1/service", "SmsNotificationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.chinatelecom.com.cn/wsdl/ctcc/sms/notification/v2_1/service", "SmsNotification"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SmsNotification".equals(portName)) {
            setSmsNotificationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
