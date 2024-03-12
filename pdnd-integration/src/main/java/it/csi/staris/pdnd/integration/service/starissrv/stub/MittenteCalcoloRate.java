/**
 * MittenteCalcoloRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class MittenteCalcoloRate  implements java.io.Serializable {
    private java.lang.String codice;

    private java.lang.String idComunicazione;

    private java.lang.String agenzia;

    private java.lang.String tipoFruitore;

    public MittenteCalcoloRate() {
    }

    public MittenteCalcoloRate(
           java.lang.String codice,
           java.lang.String idComunicazione,
           java.lang.String agenzia,
           java.lang.String tipoFruitore) {
           this.codice = codice;
           this.idComunicazione = idComunicazione;
           this.agenzia = agenzia;
           this.tipoFruitore = tipoFruitore;
    }


    /**
     * Gets the codice value for this MittenteCalcoloRate.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this MittenteCalcoloRate.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the idComunicazione value for this MittenteCalcoloRate.
     * 
     * @return idComunicazione
     */
    public java.lang.String getIdComunicazione() {
        return idComunicazione;
    }


    /**
     * Sets the idComunicazione value for this MittenteCalcoloRate.
     * 
     * @param idComunicazione
     */
    public void setIdComunicazione(java.lang.String idComunicazione) {
        this.idComunicazione = idComunicazione;
    }


    /**
     * Gets the agenzia value for this MittenteCalcoloRate.
     * 
     * @return agenzia
     */
    public java.lang.String getAgenzia() {
        return agenzia;
    }


    /**
     * Sets the agenzia value for this MittenteCalcoloRate.
     * 
     * @param agenzia
     */
    public void setAgenzia(java.lang.String agenzia) {
        this.agenzia = agenzia;
    }


    /**
     * Gets the tipoFruitore value for this MittenteCalcoloRate.
     * 
     * @return tipoFruitore
     */
    public java.lang.String getTipoFruitore() {
        return tipoFruitore;
    }


    /**
     * Sets the tipoFruitore value for this MittenteCalcoloRate.
     * 
     * @param tipoFruitore
     */
    public void setTipoFruitore(java.lang.String tipoFruitore) {
        this.tipoFruitore = tipoFruitore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MittenteCalcoloRate)) return false;
        MittenteCalcoloRate other = (MittenteCalcoloRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codice==null && other.getCodice()==null) || 
             (this.codice!=null &&
              this.codice.equals(other.getCodice()))) &&
            ((this.idComunicazione==null && other.getIdComunicazione()==null) || 
             (this.idComunicazione!=null &&
              this.idComunicazione.equals(other.getIdComunicazione()))) &&
            ((this.agenzia==null && other.getAgenzia()==null) || 
             (this.agenzia!=null &&
              this.agenzia.equals(other.getAgenzia()))) &&
            ((this.tipoFruitore==null && other.getTipoFruitore()==null) || 
             (this.tipoFruitore!=null &&
              this.tipoFruitore.equals(other.getTipoFruitore())));
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
        if (getCodice() != null) {
            _hashCode += getCodice().hashCode();
        }
        if (getIdComunicazione() != null) {
            _hashCode += getIdComunicazione().hashCode();
        }
        if (getAgenzia() != null) {
            _hashCode += getAgenzia().hashCode();
        }
        if (getTipoFruitore() != null) {
            _hashCode += getTipoFruitore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MittenteCalcoloRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittenteCalcoloRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenzia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agenzia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFruitore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoFruitore"));
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
