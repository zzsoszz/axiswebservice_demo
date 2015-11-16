/**
 * OrderRelationUpdateNotifyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bxtel.dx.gx.webservice1;

public class OrderRelationUpdateNotifyReq  implements java.io.Serializable {
    private int OPType;

    private java.lang.String packageID;

    private java.lang.String oldPackageID;

    private java.lang.String productID;

    private java.lang.String oldProductID;

    private java.lang.String streamingNo;

    private java.lang.String userID;

    private int userIDType;

    private java.lang.String[] verUserID;

    public OrderRelationUpdateNotifyReq() {
    }

    public OrderRelationUpdateNotifyReq(
           int OPType,
           java.lang.String packageID,
           java.lang.String oldPackageID,
           java.lang.String productID,
           java.lang.String oldProductID,
           java.lang.String streamingNo,
           java.lang.String userID,
           int userIDType,
           java.lang.String[] verUserID) {
           this.OPType = OPType;
           this.packageID = packageID;
           this.oldPackageID = oldPackageID;
           this.productID = productID;
           this.oldProductID = oldProductID;
           this.streamingNo = streamingNo;
           this.userID = userID;
           this.userIDType = userIDType;
           this.verUserID = verUserID;
    }


    /**
     * Gets the OPType value for this OrderRelationUpdateNotifyReq.
     * 
     * @return OPType
     */
    public int getOPType() {
        return OPType;
    }


    /**
     * Sets the OPType value for this OrderRelationUpdateNotifyReq.
     * 
     * @param OPType
     */
    public void setOPType(int OPType) {
        this.OPType = OPType;
    }


    /**
     * Gets the packageID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return packageID
     */
    public java.lang.String getPackageID() {
        return packageID;
    }


    /**
     * Sets the packageID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param packageID
     */
    public void setPackageID(java.lang.String packageID) {
        this.packageID = packageID;
    }


    /**
     * Gets the oldPackageID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return oldPackageID
     */
    public java.lang.String getOldPackageID() {
        return oldPackageID;
    }


    /**
     * Sets the oldPackageID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param oldPackageID
     */
    public void setOldPackageID(java.lang.String oldPackageID) {
        this.oldPackageID = oldPackageID;
    }


    /**
     * Gets the productID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the oldProductID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return oldProductID
     */
    public java.lang.String getOldProductID() {
        return oldProductID;
    }


    /**
     * Sets the oldProductID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param oldProductID
     */
    public void setOldProductID(java.lang.String oldProductID) {
        this.oldProductID = oldProductID;
    }


    /**
     * Gets the streamingNo value for this OrderRelationUpdateNotifyReq.
     * 
     * @return streamingNo
     */
    public java.lang.String getStreamingNo() {
        return streamingNo;
    }


    /**
     * Sets the streamingNo value for this OrderRelationUpdateNotifyReq.
     * 
     * @param streamingNo
     */
    public void setStreamingNo(java.lang.String streamingNo) {
        this.streamingNo = streamingNo;
    }


    /**
     * Gets the userID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the userIDType value for this OrderRelationUpdateNotifyReq.
     * 
     * @return userIDType
     */
    public int getUserIDType() {
        return userIDType;
    }


    /**
     * Sets the userIDType value for this OrderRelationUpdateNotifyReq.
     * 
     * @param userIDType
     */
    public void setUserIDType(int userIDType) {
        this.userIDType = userIDType;
    }


    /**
     * Gets the verUserID value for this OrderRelationUpdateNotifyReq.
     * 
     * @return verUserID
     */
    public java.lang.String[] getVerUserID() {
        return verUserID;
    }


    /**
     * Sets the verUserID value for this OrderRelationUpdateNotifyReq.
     * 
     * @param verUserID
     */
    public void setVerUserID(java.lang.String[] verUserID) {
        this.verUserID = verUserID;
    }

    public java.lang.String getVerUserID(int i) {
        return this.verUserID[i];
    }

    public void setVerUserID(int i, java.lang.String _value) {
        this.verUserID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderRelationUpdateNotifyReq)) return false;
        OrderRelationUpdateNotifyReq other = (OrderRelationUpdateNotifyReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.OPType == other.getOPType() &&
            ((this.packageID==null && other.getPackageID()==null) || 
             (this.packageID!=null &&
              this.packageID.equals(other.getPackageID()))) &&
            ((this.oldPackageID==null && other.getOldPackageID()==null) || 
             (this.oldPackageID!=null &&
              this.oldPackageID.equals(other.getOldPackageID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.oldProductID==null && other.getOldProductID()==null) || 
             (this.oldProductID!=null &&
              this.oldProductID.equals(other.getOldProductID()))) &&
            ((this.streamingNo==null && other.getStreamingNo()==null) || 
             (this.streamingNo!=null &&
              this.streamingNo.equals(other.getStreamingNo()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            this.userIDType == other.getUserIDType() &&
            ((this.verUserID==null && other.getVerUserID()==null) || 
             (this.verUserID!=null &&
              java.util.Arrays.equals(this.verUserID, other.getVerUserID())));
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
        _hashCode += getOPType();
        if (getPackageID() != null) {
            _hashCode += getPackageID().hashCode();
        }
        if (getOldPackageID() != null) {
            _hashCode += getOldPackageID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getOldProductID() != null) {
            _hashCode += getOldProductID().hashCode();
        }
        if (getStreamingNo() != null) {
            _hashCode += getStreamingNo().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        _hashCode += getUserIDType();
        if (getVerUserID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVerUserID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVerUserID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderRelationUpdateNotifyReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "OrderRelationUpdateNotifyReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "OPType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "packageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "oldPackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "oldProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "streamingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "userIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com", "VerUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
