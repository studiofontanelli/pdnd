/**
 * ParametriRichiestaPagamentoRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriRichiestaPagamentoRate  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare;

    private long identificatiovoPianoRate;

    private int annoPianoRate;

    public ParametriRichiestaPagamentoRate() {
    }

    public ParametriRichiestaPagamentoRate(
           it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare,
           long identificatiovoPianoRate,
           int annoPianoRate) {
           this.mittente = mittente;
           this.rateDaPagare = rateDaPagare;
           this.identificatiovoPianoRate = identificatiovoPianoRate;
           this.annoPianoRate = annoPianoRate;
    }


    /**
     * Gets the mittente value for this ParametriRichiestaPagamentoRate.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriRichiestaPagamentoRate.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the rateDaPagare value for this ParametriRichiestaPagamentoRate.
     * 
     * @return rateDaPagare
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] getRateDaPagare() {
        return rateDaPagare;
    }


    /**
     * Sets the rateDaPagare value for this ParametriRichiestaPagamentoRate.
     * 
     * @param rateDaPagare
     */
    public void setRateDaPagare(it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare) {
        this.rateDaPagare = rateDaPagare;
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Rata getRateDaPagare(int i) {
        return this.rateDaPagare[i];
    }

    public void setRateDaPagare(int i, it.csi.staris.pdnd.integration.service.starissrv.stub.Rata _value) {
        this.rateDaPagare[i] = _value;
    }


    /**
     * Gets the identificatiovoPianoRate value for this ParametriRichiestaPagamentoRate.
     * 
     * @return identificatiovoPianoRate
     */
    public long getIdentificatiovoPianoRate() {
        return identificatiovoPianoRate;
    }


    /**
     * Sets the identificatiovoPianoRate value for this ParametriRichiestaPagamentoRate.
     * 
     * @param identificatiovoPianoRate
     */
    public void setIdentificatiovoPianoRate(long identificatiovoPianoRate) {
        this.identificatiovoPianoRate = identificatiovoPianoRate;
    }


    /**
     * Gets the annoPianoRate value for this ParametriRichiestaPagamentoRate.
     * 
     * @return annoPianoRate
     */
    public int getAnnoPianoRate() {
        return annoPianoRate;
    }


    /**
     * Sets the annoPianoRate value for this ParametriRichiestaPagamentoRate.
     * 
     * @param annoPianoRate
     */
    public void setAnnoPianoRate(int annoPianoRate) {
        this.annoPianoRate = annoPianoRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriRichiestaPagamentoRate)) return false;
        ParametriRichiestaPagamentoRate other = (ParametriRichiestaPagamentoRate) obj;
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
            ((this.rateDaPagare==null && other.getRateDaPagare()==null) || 
             (this.rateDaPagare!=null &&
              java.util.Arrays.equals(this.rateDaPagare, other.getRateDaPagare()))) &&
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
        if (getRateDaPagare() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateDaPagare());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateDaPagare(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getIdentificatiovoPianoRate()).hashCode();
        _hashCode += getAnnoPianoRate();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriRichiestaPagamentoRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaPagamentoRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittenteCalcoloRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateDaPagare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateDaPagare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "rata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
