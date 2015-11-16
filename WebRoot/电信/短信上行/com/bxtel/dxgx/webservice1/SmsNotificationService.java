/**
 * SmsNotificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dxgx.webservice1;

public interface SmsNotificationService extends javax.xml.rpc.Service {
    public java.lang.String getSmsNotificationAddress();

    public com.bxtel.dxgx.webservice1.SmsNotification_PortType getSmsNotification() throws javax.xml.rpc.ServiceException;

    public com.bxtel.dxgx.webservice1.SmsNotification_PortType getSmsNotification(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
