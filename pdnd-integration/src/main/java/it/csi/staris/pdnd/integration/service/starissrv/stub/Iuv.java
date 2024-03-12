/**
 * Iuv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class Iuv  implements java.io.Serializable {
    private java.lang.String iuv;

    private java.lang.String descErrore;

    public Iuv() {
    }

    public Iuv(
           java.lang.String iuv,
           java.lang.String descErrore) {
           this.iuv = iuv;
           this.descErrore = descErrore;
    }


    /**
     * Gets the iuv value for this Iuv.
     * 
     * @return iuv
     */
    public java.lang.String getIuv() {
        return iuv;
    }


    /**
     * Sets the iuv value for this Iuv.
     * 
     * @param iuv
     */
    public void setIuv(java.lang.String iuv) {
        this.iuv = iuv;
    }


    /**
     * Gets the descErrore value for this Iuv.
     * 
     * @return descErrore
     */
    public java.lang.String getDescErrore() {
        return descErrore;
    }


    /**
     * Sets the descErrore value for this Iuv.
     * 
     * @param descErrore
     */
    public void setDescErrore(java.lang.String descErrore) {
        this.descErrore = descErrore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Iuv)) return false;
        Iuv other = (Iuv) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iuv==null && other.getIuv()==null) || 
             (this.iuv!=null &&
              this.iuv.equals(other.getIuv()))) &&
            ((this.descErrore==null && other.getDescErrore()==null) || 
             (this.descErrore!=null &&
              this.descErrore.equals(other.getDescErrore())));
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
        if (getIuv() != null) {
            _hashCode += getIuv().hashCode();
        }
        if (getDescErrore() != null) {
            _hashCode += getDescErrore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Iuv.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "iuv"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iuv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iuv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
