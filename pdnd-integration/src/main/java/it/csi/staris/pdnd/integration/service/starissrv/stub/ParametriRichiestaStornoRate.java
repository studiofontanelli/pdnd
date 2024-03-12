/**
 * ParametriRichiestaStornoRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriRichiestaStornoRate  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente;

    private java.lang.String numeroRicevuta;

    public ParametriRichiestaStornoRate() {
    }

    public ParametriRichiestaStornoRate(
           it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente,
           java.lang.String numeroRicevuta) {
           this.mittente = mittente;
           this.numeroRicevuta = numeroRicevuta;
    }


    /**
     * Gets the mittente value for this ParametriRichiestaStornoRate.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriRichiestaStornoRate.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the numeroRicevuta value for this ParametriRichiestaStornoRate.
     * 
     * @return numeroRicevuta
     */
    public java.lang.String getNumeroRicevuta() {
        return numeroRicevuta;
    }


    /**
     * Sets the numeroRicevuta value for this ParametriRichiestaStornoRate.
     * 
     * @param numeroRicevuta
     */
    public void setNumeroRicevuta(java.lang.String numeroRicevuta) {
        this.numeroRicevuta = numeroRicevuta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriRichiestaStornoRate)) return false;
        ParametriRichiestaStornoRate other = (ParametriRichiestaStornoRate) obj;
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
            ((this.numeroRicevuta==null && other.getNumeroRicevuta()==null) || 
             (this.numeroRicevuta!=null &&
              this.numeroRicevuta.equals(other.getNumeroRicevuta())));
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
        if (getNumeroRicevuta() != null) {
            _hashCode += getNumeroRicevuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriRichiestaStornoRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaStornoRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittenteCalcoloRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRicevuta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroRicevuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
