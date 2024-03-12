/**
 * Errori.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class Errori  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] elencoErrori;

    public Errori() {
    }

    public Errori(
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] elencoErrori) {
           this.elencoErrori = elencoErrori;
    }


    /**
     * Gets the elencoErrori value for this Errori.
     * 
     * @return elencoErrori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] getElencoErrori() {
        return elencoErrori;
    }


    /**
     * Sets the elencoErrori value for this Errori.
     * 
     * @param elencoErrori
     */
    public void setElencoErrori(it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] elencoErrori) {
        this.elencoErrori = elencoErrori;
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errore getElencoErrori(int i) {
        return this.elencoErrori[i];
    }

    public void setElencoErrori(int i, it.csi.staris.pdnd.integration.service.starissrv.stub.Errore _value) {
        this.elencoErrori[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Errori)) return false;
        Errori other = (Errori) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elencoErrori==null && other.getElencoErrori()==null) || 
             (this.elencoErrori!=null &&
              java.util.Arrays.equals(this.elencoErrori, other.getElencoErrori())));
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
        if (getElencoErrori() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElencoErrori());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElencoErrori(), i);
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
        new org.apache.axis.description.TypeDesc(Errori.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errori"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elencoErrori");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elencoErrori"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errore"));
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
