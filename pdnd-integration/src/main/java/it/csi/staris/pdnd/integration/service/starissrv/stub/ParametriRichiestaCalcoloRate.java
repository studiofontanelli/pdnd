/**
 * ParametriRichiestaCalcoloRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriRichiestaCalcoloRate  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente;

    private java.lang.String codiceFiscale;

    private long identificatiovoPianoRate;

    private int annoPianoRate;

    public ParametriRichiestaCalcoloRate() {
    }

    public ParametriRichiestaCalcoloRate(
           it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente,
           java.lang.String codiceFiscale,
           long identificatiovoPianoRate,
           int annoPianoRate) {
           this.mittente = mittente;
           this.codiceFiscale = codiceFiscale;
           this.identificatiovoPianoRate = identificatiovoPianoRate;
           this.annoPianoRate = annoPianoRate;
    }


    /**
     * Gets the mittente value for this ParametriRichiestaCalcoloRate.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriRichiestaCalcoloRate.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the codiceFiscale value for this ParametriRichiestaCalcoloRate.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this ParametriRichiestaCalcoloRate.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the identificatiovoPianoRate value for this ParametriRichiestaCalcoloRate.
     * 
     * @return identificatiovoPianoRate
     */
    public long getIdentificatiovoPianoRate() {
        return identificatiovoPianoRate;
    }


    /**
     * Sets the identificatiovoPianoRate value for this ParametriRichiestaCalcoloRate.
     * 
     * @param identificatiovoPianoRate
     */
    public void setIdentificatiovoPianoRate(long identificatiovoPianoRate) {
        this.identificatiovoPianoRate = identificatiovoPianoRate;
    }


    /**
     * Gets the annoPianoRate value for this ParametriRichiestaCalcoloRate.
     * 
     * @return annoPianoRate
     */
    public int getAnnoPianoRate() {
        return annoPianoRate;
    }


    /**
     * Sets the annoPianoRate value for this ParametriRichiestaCalcoloRate.
     * 
     * @param annoPianoRate
     */
    public void setAnnoPianoRate(int annoPianoRate) {
        this.annoPianoRate = annoPianoRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriRichiestaCalcoloRate)) return false;
        ParametriRichiestaCalcoloRate other = (ParametriRichiestaCalcoloRate) obj;
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
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            this.identificatiovoPianoRate == other.getIdentificatiovoPianoRate() &&
            this.annoPianoRate == other.getAnnoPianoRate();
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
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        _hashCode += new Long(getIdentificatiovoPianoRate()).hashCode();
        _hashCode += getAnnoPianoRate();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriRichiestaCalcoloRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaCalcoloRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittenteCalcoloRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificatiovoPianoRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificatiovoPianoRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoPianoRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoPianoRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
