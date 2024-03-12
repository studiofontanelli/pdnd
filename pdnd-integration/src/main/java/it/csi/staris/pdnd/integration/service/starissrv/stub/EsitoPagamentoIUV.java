/**
 * EsitoPagamentoIUV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class EsitoPagamentoIUV  implements java.io.Serializable {
    private java.lang.String esito;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori;

    private java.lang.String iuv;

    private java.lang.Integer totale;

    private java.lang.String codiceFiscaleEnte;

    public EsitoPagamentoIUV() {
    }

    public EsitoPagamentoIUV(
           java.lang.String esito,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori,
           java.lang.String iuv,
           java.lang.Integer totale,
           java.lang.String codiceFiscaleEnte) {
           this.esito = esito;
           this.errori = errori;
           this.iuv = iuv;
           this.totale = totale;
           this.codiceFiscaleEnte = codiceFiscaleEnte;
    }


    /**
     * Gets the esito value for this EsitoPagamentoIUV.
     * 
     * @return esito
     */
    public java.lang.String getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this EsitoPagamentoIUV.
     * 
     * @param esito
     */
    public void setEsito(java.lang.String esito) {
        this.esito = esito;
    }


    /**
     * Gets the errori value for this EsitoPagamentoIUV.
     * 
     * @return errori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errori getErrori() {
        return errori;
    }


    /**
     * Sets the errori value for this EsitoPagamentoIUV.
     * 
     * @param errori
     */
    public void setErrori(it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori) {
        this.errori = errori;
    }


    /**
     * Gets the iuv value for this EsitoPagamentoIUV.
     * 
     * @return iuv
     */
    public java.lang.String getIuv() {
        return iuv;
    }


    /**
     * Sets the iuv value for this EsitoPagamentoIUV.
     * 
     * @param iuv
     */
    public void setIuv(java.lang.String iuv) {
        this.iuv = iuv;
    }


    /**
     * Gets the totale value for this EsitoPagamentoIUV.
     * 
     * @return totale
     */
    public java.lang.Integer getTotale() {
        return totale;
    }


    /**
     * Sets the totale value for this EsitoPagamentoIUV.
     * 
     * @param totale
     */
    public void setTotale(java.lang.Integer totale) {
        this.totale = totale;
    }


    /**
     * Gets the codiceFiscaleEnte value for this EsitoPagamentoIUV.
     * 
     * @return codiceFiscaleEnte
     */
    public java.lang.String getCodiceFiscaleEnte() {
        return codiceFiscaleEnte;
    }


    /**
     * Sets the codiceFiscaleEnte value for this EsitoPagamentoIUV.
     * 
     * @param codiceFiscaleEnte
     */
    public void setCodiceFiscaleEnte(java.lang.String codiceFiscaleEnte) {
        this.codiceFiscaleEnte = codiceFiscaleEnte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EsitoPagamentoIUV)) return false;
        EsitoPagamentoIUV other = (EsitoPagamentoIUV) obj;
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
            ((this.iuv==null && other.getIuv()==null) || 
             (this.iuv!=null &&
              this.iuv.equals(other.getIuv()))) &&
            ((this.totale==null && other.getTotale()==null) || 
             (this.totale!=null &&
              this.totale.equals(other.getTotale()))) &&
            ((this.codiceFiscaleEnte==null && other.getCodiceFiscaleEnte()==null) || 
             (this.codiceFiscaleEnte!=null &&
              this.codiceFiscaleEnte.equals(other.getCodiceFiscaleEnte())));
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
        if (getIuv() != null) {
            _hashCode += getIuv().hashCode();
        }
        if (getTotale() != null) {
            _hashCode += getTotale().hashCode();
        }
        if (getCodiceFiscaleEnte() != null) {
            _hashCode += getCodiceFiscaleEnte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EsitoPagamentoIUV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoIUV"));
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
        elemField.setFieldName("iuv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iuv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFiscaleEnte"));
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
