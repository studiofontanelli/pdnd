/**
 * ParametriStorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriStorno  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento;

    public ParametriStorno() {
    }

    public ParametriStorno(
           it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente,
           it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento) {
           this.mittente = mittente;
           this.identificativoPagamento = identificativoPagamento;
    }


    /**
     * Gets the mittente value for this ParametriStorno.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriStorno.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the identificativoPagamento value for this ParametriStorno.
     * 
     * @return identificativoPagamento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento getIdentificativoPagamento() {
        return identificativoPagamento;
    }


    /**
     * Sets the identificativoPagamento value for this ParametriStorno.
     * 
     * @param identificativoPagamento
     */
    public void setIdentificativoPagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento) {
        this.identificativoPagamento = identificativoPagamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriStorno)) return false;
        ParametriStorno other = (ParametriStorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mittente==null && other.getMittente()==null) || 
             (this.mittente!=null &&
              this.mittente.equals(other.getMittente()))) &&
            ((this.identificativoPagamento==null && other.getIdentificativoPagamento()==null) || 
             (this.identificativoPagamento!=null &&
              this.identificativoPagamento.equals(other.getIdentificativoPagamento())));
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
        if (getMittente() != null) {
            _hashCode += getMittente().hashCode();
        }
        if (getIdentificativoPagamento() != null) {
            _hashCode += getIdentificativoPagamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriStorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriStorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "identificativoPagamento"));
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
