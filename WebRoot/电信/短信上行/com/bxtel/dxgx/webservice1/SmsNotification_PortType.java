/**
 * SmsNotification_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dxgx.webservice1;

public interface SmsNotification_PortType extends java.rmi.Remote {
    public void notifySmsReception(java.lang.String registrationIdentifier, com.bxtel.dxgx.webservice1.SmsMessage message) throws java.rmi.RemoteException;
    public void notifySmsDeliveryReceipt(java.lang.String correlator, com.bxtel.dxgx.webservice1.DeliveryInformation deliveryStatus) throws java.rmi.RemoteException;
}
