/**
 * Mittente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class Mittente  implements java.io.Serializable {
    private java.lang.String codice;

    private java.lang.String idComunicazione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoFruitore tipoFruitore;

    private java.lang.String agenzia;

    public Mittente() {
    }

    public Mittente(
           java.lang.String codice,
           java.lang.String idComunicazione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoFruitore tipoFruitore,
           java.lang.String agenzia) {
           this.codice = codice;
           this.idComunicazione = idComunicazione;
           this.tipoFruitore = tipoFruitore;
           this.agenzia = agenzia;
    }


    /**
     * Gets the codice value for this Mittente.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this Mittente.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the idComunicazione value for this Mittente.
     * 
     * @return idComunicazione
     */
    public java.lang.String getIdComunicazione() {
        return idComunicazione;
    }


    /**
     * Sets the idComunicazione value for this Mittente.
     * 
     * @param idComunicazione
     */
    public void setIdComunicazione(java.lang.String idComunicazione) {
        this.idComunicazione = idComunicazione;
    }


    /**
     * Gets the tipoFruitore value for this Mittente.
     * 
     * @return tipoFruitore
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoFruitore getTipoFruitore() {
        return tipoFruitore;
    }


    /**
     * Sets the tipoFruitore value for this Mittente.
     * 
     * @param tipoFruitore
     */
    public void setTipoFruitore(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoFruitore tipoFruitore) {
        this.tipoFruitore = tipoFruitore;
    }


    /**
     * Gets the agenzia value for this Mittente.
     * 
     * @return agenzia
     */
    public java.lang.String getAgenzia() {
        return agenzia;
    }


    /**
     * Sets the agenzia value for this Mittente.
     * 
     * @param agenzia
     */
    public void setAgenzia(java.lang.String agenzia) {
        this.agenzia = agenzia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mittente)) return false;
        Mittente other = (Mittente) obj;
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
            ((this.tipoFruitore==null && other.getTipoFruitore()==null) || 
             (this.tipoFruitore!=null &&
              this.tipoFruitore.equals(other.getTipoFruitore()))) &&
            ((this.agenzia==null && other.getAgenzia()==null) || 
             (this.agenzia!=null &&
              this.agenzia.equals(other.getAgenzia())));
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
        if (getTipoFruitore() != null) {
            _hashCode += getTipoFruitore().hashCode();
        }
        if (getAgenzia() != null) {
            _hashCode += getAgenzia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mittente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFruitore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoFruitore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoFruitore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenzia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agenzia"));
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
