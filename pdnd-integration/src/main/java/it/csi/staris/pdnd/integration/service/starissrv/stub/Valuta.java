/**
 * Valuta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class Valuta  implements java.io.Serializable {
    private java.lang.String importo;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Divisa divisa;

    public Valuta() {
    }

    public Valuta(
           java.lang.String importo,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Divisa divisa) {
           this.importo = importo;
           this.divisa = divisa;
    }


    /**
     * Gets the importo value for this Valuta.
     * 
     * @return importo
     */
    public java.lang.String getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this Valuta.
     * 
     * @param importo
     */
    public void setImporto(java.lang.String importo) {
        this.importo = importo;
    }


    /**
     * Gets the divisa value for this Valuta.
     * 
     * @return divisa
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Divisa getDivisa() {
        return divisa;
    }


    /**
     * Sets the divisa value for this Valuta.
     * 
     * @param divisa
     */
    public void setDivisa(it.csi.staris.pdnd.integration.service.starissrv.stub.Divisa divisa) {
        this.divisa = divisa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Valuta)) return false;
        Valuta other = (Valuta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            ((this.divisa==null && other.getDivisa()==null) || 
             (this.divisa!=null &&
              this.divisa.equals(other.getDivisa())));
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
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        if (getDivisa() != null) {
            _hashCode += getDivisa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Valuta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "divisa"));
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
