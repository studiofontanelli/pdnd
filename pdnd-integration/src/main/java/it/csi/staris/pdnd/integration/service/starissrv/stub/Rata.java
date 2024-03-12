/**
 * Rata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class Rata  implements java.io.Serializable {
    private java.lang.String codiceBollettino;

    private int numero;

    private java.lang.String scadenza;

    private int importo;

    public Rata() {
    }

    public Rata(
           java.lang.String codiceBollettino,
           int numero,
           java.lang.String scadenza,
           int importo) {
           this.codiceBollettino = codiceBollettino;
           this.numero = numero;
           this.scadenza = scadenza;
           this.importo = importo;
    }


    /**
     * Gets the codiceBollettino value for this Rata.
     * 
     * @return codiceBollettino
     */
    public java.lang.String getCodiceBollettino() {
        return codiceBollettino;
    }


    /**
     * Sets the codiceBollettino value for this Rata.
     * 
     * @param codiceBollettino
     */
    public void setCodiceBollettino(java.lang.String codiceBollettino) {
        this.codiceBollettino = codiceBollettino;
    }


    /**
     * Gets the numero value for this Rata.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Rata.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the scadenza value for this Rata.
     * 
     * @return scadenza
     */
    public java.lang.String getScadenza() {
        return scadenza;
    }


    /**
     * Sets the scadenza value for this Rata.
     * 
     * @param scadenza
     */
    public void setScadenza(java.lang.String scadenza) {
        this.scadenza = scadenza;
    }


    /**
     * Gets the importo value for this Rata.
     * 
     * @return importo
     */
    public int getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this Rata.
     * 
     * @param importo
     */
    public void setImporto(int importo) {
        this.importo = importo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rata)) return false;
        Rata other = (Rata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceBollettino==null && other.getCodiceBollettino()==null) || 
             (this.codiceBollettino!=null &&
              this.codiceBollettino.equals(other.getCodiceBollettino()))) &&
            this.numero == other.getNumero() &&
            ((this.scadenza==null && other.getScadenza()==null) || 
             (this.scadenza!=null &&
              this.scadenza.equals(other.getScadenza()))) &&
            this.importo == other.getImporto();
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
        if (getCodiceBollettino() != null) {
            _hashCode += getCodiceBollettino().hashCode();
        }
        _hashCode += getNumero();
        if (getScadenza() != null) {
            _hashCode += getScadenza().hashCode();
        }
        _hashCode += getImporto();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "rata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importo"));
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
