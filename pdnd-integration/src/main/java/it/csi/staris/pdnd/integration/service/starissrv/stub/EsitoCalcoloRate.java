/**
 * EsitoCalcoloRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class EsitoCalcoloRate  implements java.io.Serializable {
    private java.lang.String codice;

    private int identificativo;

    private java.lang.String cognomeNome;

    private java.lang.String codiceFiscale;

    private int anno;

    private int numeroTotaleRate;

    private int impTotaleRate;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] errori;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare;

    public EsitoCalcoloRate() {
    }

    public EsitoCalcoloRate(
           java.lang.String codice,
           int identificativo,
           java.lang.String cognomeNome,
           java.lang.String codiceFiscale,
           int anno,
           int numeroTotaleRate,
           int impTotaleRate,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] errori,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] rateDaPagare) {
           this.codice = codice;
           this.identificativo = identificativo;
           this.cognomeNome = cognomeNome;
           this.codiceFiscale = codiceFiscale;
           this.anno = anno;
           this.numeroTotaleRate = numeroTotaleRate;
           this.impTotaleRate = impTotaleRate;
           this.errori = errori;
           this.rateDaPagare = rateDaPagare;
    }


    /**
     * Gets the codice value for this EsitoCalcoloRate.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this EsitoCalcoloRate.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the identificativo value for this EsitoCalcoloRate.
     * 
     * @return identificativo
     */
    public int getIdentificativo() {
        return identificativo;
    }


    /**
     * Sets the identificativo value for this EsitoCalcoloRate.
     * 
     * @param identificativo
     */
    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }


    /**
     * Gets the cognomeNome value for this EsitoCalcoloRate.
     * 
     * @return cognomeNome
     */
    public java.lang.String getCognomeNome() {
        return cognomeNome;
    }


    /**
     * Sets the cognomeNome value for this EsitoCalcoloRate.
     * 
     * @param cognomeNome
     */
    public void setCognomeNome(java.lang.String cognomeNome) {
        this.cognomeNome = cognomeNome;
    }


    /**
     * Gets the codiceFiscale value for this EsitoCalcoloRate.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this EsitoCalcoloRate.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the anno value for this EsitoCalcoloRate.
     * 
     * @return anno
     */
    public int getAnno() {
        return anno;
    }


    /**
     * Sets the anno value for this EsitoCalcoloRate.
     * 
     * @param anno
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }


    /**
     * Gets the numeroTotaleRate value for this EsitoCalcoloRate.
     * 
     * @return numeroTotaleRate
     */
    public int getNumeroTotaleRate() {
        return numeroTotaleRate;
    }


    /**
     * Sets the numeroTotaleRate value for this EsitoCalcoloRate.
     * 
     * @param numeroTotaleRate
     */
    public void setNumeroTotaleRate(int numeroTotaleRate) {
        this.numeroTotaleRate = numeroTotaleRate;
    }


    /**
     * Gets the impTotaleRate value for this EsitoCalcoloRate.
     * 
     * @return impTotaleRate
     */
    public int getImpTotaleRate() {
        return impTotaleRate;
    }


    /**
     * Sets the impTotaleRate value for this EsitoCalcoloRate.
     * 
     * @param impTotaleRate
     */
    public void setImpTotaleRate(int impTotaleRate) {
        this.impTotaleRate = impTotaleRate;
    }


    /**
     * Gets the errori value for this EsitoCalcoloRate.
     * 
     * @return errori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] getErrori() {
        return errori;
    }


    /**
     * Sets the errori value for this EsitoCalcoloRate.
     * 
     * @param errori
     */
    public void setErrori(it.csi.staris.pdnd.integration.service.starissrv.stub.Errore[] errori) {
        this.errori = errori;
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errore getErrori(int i) {
        return this.errori[i];
    }

    public void setErrori(int i, it.csi.staris.pdnd.integration.service.starissrv.stub.Errore _value) {
        this.errori[i] = _value;
    }


    /**
     * Gets the rateDaPagare value for this EsitoCalcoloRate.
     * 
     * @return rateDaPagare
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Rata[] getRateDaPagare() {
        return rateDaPagare;
    }


    /**
     * Sets the rateDaPagare value for this EsitoCalcoloRate.
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
        if (!(obj instanceof EsitoCalcoloRate)) return false;
        EsitoCalcoloRate other = (EsitoCalcoloRate) obj;
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
            this.identificativo == other.getIdentificativo() &&
            ((this.cognomeNome==null && other.getCognomeNome()==null) || 
             (this.cognomeNome!=null &&
              this.cognomeNome.equals(other.getCognomeNome()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            this.anno == other.getAnno() &&
            this.numeroTotaleRate == other.getNumeroTotaleRate() &&
            this.impTotaleRate == other.getImpTotaleRate() &&
            ((this.errori==null && other.getErrori()==null) || 
             (this.errori!=null &&
              java.util.Arrays.equals(this.errori, other.getErrori()))) &&
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
        if (getCodice() != null) {
            _hashCode += getCodice().hashCode();
        }
        _hashCode += getIdentificativo();
        if (getCognomeNome() != null) {
            _hashCode += getCognomeNome().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        _hashCode += getAnno();
        _hashCode += getNumeroTotaleRate();
        _hashCode += getImpTotaleRate();
        if (getErrori() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrori());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrori(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EsitoCalcoloRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognomeNome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cognomeNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTotaleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroTotaleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTotaleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "impTotaleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errori");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errori"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
