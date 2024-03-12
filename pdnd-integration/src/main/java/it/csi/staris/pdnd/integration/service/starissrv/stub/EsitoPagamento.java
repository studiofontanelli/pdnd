/**
 * EsitoPagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class EsitoPagamento  implements java.io.Serializable {
    private java.lang.String esito;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.DataOraAsString dataOraPagamento;

    public EsitoPagamento() {
    }

    public EsitoPagamento(
           java.lang.String esito,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori,
           it.csi.staris.pdnd.integration.service.starissrv.stub.DataOraAsString dataOraPagamento) {
           this.esito = esito;
           this.errori = errori;
           this.dataOraPagamento = dataOraPagamento;
    }


    /**
     * Gets the esito value for this EsitoPagamento.
     * 
     * @return esito
     */
    public java.lang.String getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this EsitoPagamento.
     * 
     * @param esito
     */
    public void setEsito(java.lang.String esito) {
        this.esito = esito;
    }


    /**
     * Gets the errori value for this EsitoPagamento.
     * 
     * @return errori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errori getErrori() {
        return errori;
    }


    /**
     * Sets the errori value for this EsitoPagamento.
     * 
     * @param errori
     */
    public void setErrori(it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori) {
        this.errori = errori;
    }


    /**
     * Gets the dataOraPagamento value for this EsitoPagamento.
     * 
     * @return dataOraPagamento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.DataOraAsString getDataOraPagamento() {
        return dataOraPagamento;
    }


    /**
     * Sets the dataOraPagamento value for this EsitoPagamento.
     * 
     * @param dataOraPagamento
     */
    public void setDataOraPagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.DataOraAsString dataOraPagamento) {
        this.dataOraPagamento = dataOraPagamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EsitoPagamento)) return false;
        EsitoPagamento other = (EsitoPagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.errori==null && other.getErrori()==null) || 
             (this.errori!=null &&
              this.errori.equals(other.getErrori()))) &&
            ((this.dataOraPagamento==null && other.getDataOraPagamento()==null) || 
             (this.dataOraPagamento!=null &&
              this.dataOraPagamento.equals(other.getDataOraPagamento())));
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
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getErrori() != null) {
            _hashCode += getErrori().hashCode();
        }
        if (getDataOraPagamento() != null) {
            _hashCode += getDataOraPagamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EsitoPagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errori");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errori"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errori"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOraPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataOraPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataOraAsString"));
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
