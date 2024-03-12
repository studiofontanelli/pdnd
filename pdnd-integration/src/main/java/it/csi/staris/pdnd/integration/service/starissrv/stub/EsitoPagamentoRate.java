/**
 * EsitoPagamentoRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class EsitoPagamentoRate  implements java.io.Serializable {
    private java.lang.String codice;

    private java.lang.String numRicevuta;

    private java.lang.String dataOraPagamento;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] elencoErrori;

    public EsitoPagamentoRate() {
    }

    public EsitoPagamentoRate(
           java.lang.String codice,
           java.lang.String numRicevuta,
           java.lang.String dataOraPagamento,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] elencoErrori) {
           this.codice = codice;
           this.numRicevuta = numRicevuta;
           this.dataOraPagamento = dataOraPagamento;
           this.elencoErrori = elencoErrori;
    }


    /**
     * Gets the codice value for this EsitoPagamentoRate.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this EsitoPagamentoRate.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the numRicevuta value for this EsitoPagamentoRate.
     * 
     * @return numRicevuta
     */
    public java.lang.String getNumRicevuta() {
        return numRicevuta;
    }


    /**
     * Sets the numRicevuta value for this EsitoPagamentoRate.
     * 
     * @param numRicevuta
     */
    public void setNumRicevuta(java.lang.String numRicevuta) {
        this.numRicevuta = numRicevuta;
    }


    /**
     * Gets the dataOraPagamento value for this EsitoPagamentoRate.
     * 
     * @return dataOraPagamento
     */
    public java.lang.String getDataOraPagamento() {
        return dataOraPagamento;
    }


    /**
     * Sets the dataOraPagamento value for this EsitoPagamentoRate.
     * 
     * @param dataOraPagamento
     */
    public void setDataOraPagamento(java.lang.String dataOraPagamento) {
        this.dataOraPagamento = dataOraPagamento;
    }


    /**
     * Gets the elencoErrori value for this EsitoPagamentoRate.
     * 
     * @return elencoErrori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] getElencoErrori() {
        return elencoErrori;
    }


    /**
     * Sets the elencoErrori value for this EsitoPagamentoRate.
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
        if (!(obj instanceof EsitoPagamentoRate)) return false;
        EsitoPagamentoRate other = (EsitoPagamentoRate) obj;
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
            ((this.numRicevuta==null && other.getNumRicevuta()==null) || 
             (this.numRicevuta!=null &&
              this.numRicevuta.equals(other.getNumRicevuta()))) &&
            ((this.dataOraPagamento==null && other.getDataOraPagamento()==null) || 
             (this.dataOraPagamento!=null &&
              this.dataOraPagamento.equals(other.getDataOraPagamento()))) &&
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
        if (getCodice() != null) {
            _hashCode += getCodice().hashCode();
        }
        if (getNumRicevuta() != null) {
            _hashCode += getNumRicevuta().hashCode();
        }
        if (getDataOraPagamento() != null) {
            _hashCode += getDataOraPagamento().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(EsitoPagamentoRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRicevuta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRicevuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOraPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataOraPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
