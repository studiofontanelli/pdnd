/**
 * ParametriPagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriPagamento  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TransazioneEnte transazioneEnte;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.NumeroRicevuta numeroRicevuta;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta speseDiEsazione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TransazionePos transazionePos;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoUtilizzato;

    private java.lang.String iuv;

    public ParametriPagamento() {
    }

    public ParametriPagamento(
           it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente,
           it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TransazioneEnte transazioneEnte,
           it.csi.staris.pdnd.integration.service.starissrv.stub.NumeroRicevuta numeroRicevuta,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta speseDiEsazione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TransazionePos transazionePos,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoUtilizzato,
           java.lang.String iuv) {
           this.mittente = mittente;
           this.identificativoPagamento = identificativoPagamento;
           this.transazioneEnte = transazioneEnte;
           this.numeroRicevuta = numeroRicevuta;
           this.speseDiEsazione = speseDiEsazione;
           this.transazionePos = transazionePos;
           this.creditoUtilizzato = creditoUtilizzato;
           this.iuv = iuv;
    }


    /**
     * Gets the mittente value for this ParametriPagamento.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriPagamento.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the identificativoPagamento value for this ParametriPagamento.
     * 
     * @return identificativoPagamento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento getIdentificativoPagamento() {
        return identificativoPagamento;
    }


    /**
     * Sets the identificativoPagamento value for this ParametriPagamento.
     * 
     * @param identificativoPagamento
     */
    public void setIdentificativoPagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento) {
        this.identificativoPagamento = identificativoPagamento;
    }


    /**
     * Gets the transazioneEnte value for this ParametriPagamento.
     * 
     * @return transazioneEnte
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TransazioneEnte getTransazioneEnte() {
        return transazioneEnte;
    }


    /**
     * Sets the transazioneEnte value for this ParametriPagamento.
     * 
     * @param transazioneEnte
     */
    public void setTransazioneEnte(it.csi.staris.pdnd.integration.service.starissrv.stub.TransazioneEnte transazioneEnte) {
        this.transazioneEnte = transazioneEnte;
    }


    /**
     * Gets the numeroRicevuta value for this ParametriPagamento.
     * 
     * @return numeroRicevuta
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.NumeroRicevuta getNumeroRicevuta() {
        return numeroRicevuta;
    }


    /**
     * Sets the numeroRicevuta value for this ParametriPagamento.
     * 
     * @param numeroRicevuta
     */
    public void setNumeroRicevuta(it.csi.staris.pdnd.integration.service.starissrv.stub.NumeroRicevuta numeroRicevuta) {
        this.numeroRicevuta = numeroRicevuta;
    }


    /**
     * Gets the speseDiEsazione value for this ParametriPagamento.
     * 
     * @return speseDiEsazione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getSpeseDiEsazione() {
        return speseDiEsazione;
    }


    /**
     * Sets the speseDiEsazione value for this ParametriPagamento.
     * 
     * @param speseDiEsazione
     */
    public void setSpeseDiEsazione(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta speseDiEsazione) {
        this.speseDiEsazione = speseDiEsazione;
    }


    /**
     * Gets the transazionePos value for this ParametriPagamento.
     * 
     * @return transazionePos
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TransazionePos getTransazionePos() {
        return transazionePos;
    }


    /**
     * Sets the transazionePos value for this ParametriPagamento.
     * 
     * @param transazionePos
     */
    public void setTransazionePos(it.csi.staris.pdnd.integration.service.starissrv.stub.TransazionePos transazionePos) {
        this.transazionePos = transazionePos;
    }


    /**
     * Gets the creditoUtilizzato value for this ParametriPagamento.
     * 
     * @return creditoUtilizzato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getCreditoUtilizzato() {
        return creditoUtilizzato;
    }


    /**
     * Sets the creditoUtilizzato value for this ParametriPagamento.
     * 
     * @param creditoUtilizzato
     */
    public void setCreditoUtilizzato(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoUtilizzato) {
        this.creditoUtilizzato = creditoUtilizzato;
    }


    /**
     * Gets the iuv value for this ParametriPagamento.
     * 
     * @return iuv
     */
    public java.lang.String getIuv() {
        return iuv;
    }


    /**
     * Sets the iuv value for this ParametriPagamento.
     * 
     * @param iuv
     */
    public void setIuv(java.lang.String iuv) {
        this.iuv = iuv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriPagamento)) return false;
        ParametriPagamento other = (ParametriPagamento) obj;
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
            ((this.identificativoPagamento==null && other.getIdentificativoPagamento()==null) || 
             (this.identificativoPagamento!=null &&
              this.identificativoPagamento.equals(other.getIdentificativoPagamento()))) &&
            ((this.transazioneEnte==null && other.getTransazioneEnte()==null) || 
             (this.transazioneEnte!=null &&
              this.transazioneEnte.equals(other.getTransazioneEnte()))) &&
            ((this.numeroRicevuta==null && other.getNumeroRicevuta()==null) || 
             (this.numeroRicevuta!=null &&
              this.numeroRicevuta.equals(other.getNumeroRicevuta()))) &&
            ((this.speseDiEsazione==null && other.getSpeseDiEsazione()==null) || 
             (this.speseDiEsazione!=null &&
              this.speseDiEsazione.equals(other.getSpeseDiEsazione()))) &&
            ((this.transazionePos==null && other.getTransazionePos()==null) || 
             (this.transazionePos!=null &&
              this.transazionePos.equals(other.getTransazionePos()))) &&
            ((this.creditoUtilizzato==null && other.getCreditoUtilizzato()==null) || 
             (this.creditoUtilizzato!=null &&
              this.creditoUtilizzato.equals(other.getCreditoUtilizzato()))) &&
            ((this.iuv==null && other.getIuv()==null) || 
             (this.iuv!=null &&
              this.iuv.equals(other.getIuv())));
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
        if (getIdentificativoPagamento() != null) {
            _hashCode += getIdentificativoPagamento().hashCode();
        }
        if (getTransazioneEnte() != null) {
            _hashCode += getTransazioneEnte().hashCode();
        }
        if (getNumeroRicevuta() != null) {
            _hashCode += getNumeroRicevuta().hashCode();
        }
        if (getSpeseDiEsazione() != null) {
            _hashCode += getSpeseDiEsazione().hashCode();
        }
        if (getTransazionePos() != null) {
            _hashCode += getTransazionePos().hashCode();
        }
        if (getCreditoUtilizzato() != null) {
            _hashCode += getCreditoUtilizzato().hashCode();
        }
        if (getIuv() != null) {
            _hashCode += getIuv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriPagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriPagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "identificativoPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transazioneEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transazioneEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "transazioneEnte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRicevuta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroRicevuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "numeroRicevuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speseDiEsazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "speseDiEsazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transazionePos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transazionePos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "transazionePos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditoUtilizzato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditoUtilizzato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iuv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iuv"));
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
