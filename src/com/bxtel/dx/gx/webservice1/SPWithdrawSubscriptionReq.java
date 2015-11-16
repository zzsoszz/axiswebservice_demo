/**
 * SPWithdrawSubscriptionReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

public class SPWithdrawSubscriptionReq  implements java.io.Serializable {
    private int userIDType;

    private java.lang.String userID;

    private int IDType;

    private java.lang.String ID;

    private java.lang.String streamingNo;

    private java.lang.String SPID;

    private java.lang.String SPAdmin;

    private java.lang.String SPAdminPwd;

    public SPWithdrawSubscriptionReq() {
    }

    public SPWithdrawSubscriptionReq(
           int userIDType,
           java.lang.String userID,
           int IDType,
           java.lang.String ID,
           java.lang.String streamingNo,
           java.lang.String SPID,
           java.lang.String SPAdmin,
           java.lang.String SPAdminPwd) {
           this.userIDType = userIDType;
           this.userID = userID;
           this.IDType = IDType;
           this.ID = ID;
           this.streamingNo = streamingNo;
           this.SPID = SPID;
           this.SPAdmin = SPAdmin;
           this.SPAdminPwd = SPAdminPwd;
    }


    /**
     * Gets the userIDType value for this SPWithdrawSubscriptionReq.
     * 
     * @return userIDType
     */
    public int getUserIDType() {
        return userIDType;
    }


    /**
     * Sets the userIDType value for this SPWithdrawSubscriptionReq.
     * 
     * @param userIDType
     */
    public void setUserIDType(int userIDType) {
        this.userIDType = userIDType;
    }


    /**
     * Gets the userID value for this SPWithdrawSubscriptionReq.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this SPWithdrawSubscriptionReq.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the IDType value for this SPWithdrawSubscriptionReq.
     * 
     * @return IDType
     */
    public int getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this SPWithdrawSubscriptionReq.
     * 
     * @param IDType
     */
    public void setIDType(int IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the ID value for this SPWithdrawSubscriptionReq.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SPWithdrawSubscriptionReq.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the streamingNo value for this SPWithdrawSubscriptionReq.
     * 
     * @return streamingNo
     */
    public java.lang.String getStreamingNo() {
        return streamingNo;
    }


    /**
     * Sets the streamingNo value for this SPWithdrawSubscriptionReq.
     * 
     * @param streamingNo
     */
    public void setStreamingNo(java.lang.String streamingNo) {
        this.streamingNo = streamingNo;
    }


    /**
     * Gets the SPID value for this SPWithdrawSubscriptionReq.
     * 
     * @return SPID
     */
    public java.lang.String getSPID() {
        return SPID;
    }


    /**
     * Sets the SPID value for this SPWithdrawSubscriptionReq.
     * 
     * @param SPID
     */
    public void setSPID(java.lang.String SPID) {
        this.SPID = SPID;
    }


    /**
     * Gets the SPAdmin value for this SPWithdrawSubscriptionReq.
     * 
     * @return SPAdmin
     */
    public java.lang.String getSPAdmin() {
        return SPAdmin;
    }


    /**
     * Sets the SPAdmin value for this SPWithdrawSubscriptionReq.
     * 
     * @param SPAdmin
     */
    public void setSPAdmin(java.lang.String SPAdmin) {
        this.SPAdmin = SPAdmin;
    }


    /**
     * Gets the SPAdminPwd value for this SPWithdrawSubscriptionReq.
     * 
     * @return SPAdminPwd
     */
    public java.lang.String getSPAdminPwd() {
        return SPAdminPwd;
    }


    /**
     * Sets the SPAdminPwd value for this SPWithdrawSubscriptionReq.
     * 
     * @param SPAdminPwd
     */
    public void setSPAdminPwd(java.lang.String SPAdminPwd) {
        this.SPAdminPwd = SPAdminPwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPWithdrawSubscriptionReq)) return false;
        SPWithdrawSubscriptionReq other = (SPWithdrawSubscriptionReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userIDType == other.getUserIDType() &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            this.IDType == other.getIDType() &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.streamingNo==null && other.getStreamingNo()==null) || 
             (this.streamingNo!=null &&
              this.streamingNo.equals(other.getStreamingNo()))) &&
            ((this.SPID==null && other.getSPID()==null) || 
             (this.SPID!=null &&
              this.SPID.equals(other.getSPID()))) &&
            ((this.SPAdmin==null && other.getSPAdmin()==null) || 
             (this.SPAdmin!=null &&
              this.SPAdmin.equals(other.getSPAdmin()))) &&
            ((this.SPAdminPwd==null && other.getSPAdminPwd()==null) || 
             (this.SPAdminPwd!=null &&
              this.SPAdminPwd.equals(other.getSPAdminPwd())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getUserIDType();
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        _hashCode += getIDType();
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getStreamingNo() != null) {
            _hashCode += getStreamingNo().hashCode();
        }
        if (getSPID() != null) {
            _hashCode += getSPID().hashCode();
        }
        if (getSPAdmin() != null) {
            _hashCode += getSPAdmin().hashCode();
        }
        if (getSPAdminPwd() != null) {
            _hashCode += getSPAdminPwd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPWithdrawSubscriptionReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPWithdrawSubscriptionReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "userIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "streamingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPAdminPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "SPAdminPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
