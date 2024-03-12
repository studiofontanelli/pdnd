/**
 * RequestPagamentoRateCumulativo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class RequestPagamentoRateCumulativo  implements java.io.Serializable {
    private long identificatiovoPianoRate;

    private int annoPianoRate;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare;

    public RequestPagamentoRateCumulativo() {
    }

    public RequestPagamentoRateCumulativo(
           long identificatiovoPianoRate,
           int annoPianoRate,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare) {
           this.identificatiovoPianoRate = identificatiovoPianoRate;
           this.annoPianoRate = annoPianoRate;
           this.rateDaPagare = rateDaPagare;
    }


    /**
     * Gets the identificatiovoPianoRate value for this RequestPagamentoRateCumulativo.
     * 
     * @return identificatiovoPianoRate
     */
    public long getIdentificatiovoPianoRate() {
        return identificatiovoPianoRate;
    }


    /**
     * Sets the identificatiovoPianoRate value for this RequestPagamentoRateCumulativo.
     * 
     * @param identificatiovoPianoRate
     */
    public void setIdentificatiovoPianoRate(long identificatiovoPianoRate) {
        this.identificatiovoPianoRate = identificatiovoPianoRate;
    }


    /**
     * Gets the annoPianoRate value for this RequestPagamentoRateCumulativo.
     * 
     * @return annoPianoRate
     */
    public int getAnnoPianoRate() {
        return annoPianoRate;
    }


    /**
     * Sets the annoPianoRate value for this RequestPagamentoRateCumulativo.
     * 
     * @param annoPianoRate
     */
    public void setAnnoPianoRate(int annoPianoRate) {
        this.annoPianoRate = annoPianoRate;
    }


    /**
     * Gets the rateDaPagare value for this RequestPagamentoRateCumulativo.
     * 
     * @return rateDaPagare
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] getRateDaPagare() {
        return rateDaPagare;
    }


    /**
     * Sets the rateDaPagare value for this RequestPagamentoRateCumulativo.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestPagamentoRateCumulativo)) return false;
        RequestPagamentoRateCumulativo other = (RequestPagamentoRateCumulativo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.identificatiovoPianoRate == other.getIdentificatiovoPianoRate() &&
            this.annoPianoRate == other.getAnnoPianoRate() &&
            ((this.rateDaPagare==null && other.getRateDaPagare()==null) || 
             (this.rateDaPagare!=null &&
              java.util.Arrays.equals(this.rateDaPagare, other.getRateDaPagare())));
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
        _hashCode += new Long(getIdentificatiovoPianoRate()).hashCode();
        _hashCode += getAnnoPianoRate();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestPagamentoRateCumulativo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "requestPagamentoRateCumulativo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateDaPagare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateDaPagare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "rata"));
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
