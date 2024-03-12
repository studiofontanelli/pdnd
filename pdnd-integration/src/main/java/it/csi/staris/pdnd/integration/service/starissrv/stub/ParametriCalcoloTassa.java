/**
 * ParametriCalcoloTassa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ParametriCalcoloTassa  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoCalcolo tipoCalcolo;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Regione regione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataPrimoRilascio;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.ModalitaCompensazione modalitaCompensazione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTargaCompensato;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targaCompensato;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenzaCompensato;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validitaCompensato;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataEvento;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoModalitaEsenzioni tipoModalitaEsenzioni;

    private java.lang.String calcoloRidotto;

    public ParametriCalcoloTassa() {
    }

    public ParametriCalcoloTassa(
           it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoCalcolo tipoCalcolo,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Regione regione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita,
           it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataPrimoRilascio,
           it.csi.staris.pdnd.integration.service.starissrv.stub.ModalitaCompensazione modalitaCompensazione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTargaCompensato,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targaCompensato,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenzaCompensato,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validitaCompensato,
           it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataEvento,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoModalitaEsenzioni tipoModalitaEsenzioni,
           java.lang.String calcoloRidotto) {
           this.mittente = mittente;
           this.tipoCalcolo = tipoCalcolo;
           this.regione = regione;
           this.tipoTarga = tipoTarga;
           this.targa = targa;
           this.scadenza = scadenza;
           this.validita = validita;
           this.codiceFiscale = codiceFiscale;
           this.tipoRiduzione = tipoRiduzione;
           this.dataPrimoRilascio = dataPrimoRilascio;
           this.modalitaCompensazione = modalitaCompensazione;
           this.tipoTargaCompensato = tipoTargaCompensato;
           this.targaCompensato = targaCompensato;
           this.scadenzaCompensato = scadenzaCompensato;
           this.validitaCompensato = validitaCompensato;
           this.dataEvento = dataEvento;
           this.tipoModalitaEsenzioni = tipoModalitaEsenzioni;
           this.calcoloRidotto = calcoloRidotto;
    }


    /**
     * Gets the mittente value for this ParametriCalcoloTassa.
     * 
     * @return mittente
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente getMittente() {
        return mittente;
    }


    /**
     * Sets the mittente value for this ParametriCalcoloTassa.
     * 
     * @param mittente
     */
    public void setMittente(it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente mittente) {
        this.mittente = mittente;
    }


    /**
     * Gets the tipoCalcolo value for this ParametriCalcoloTassa.
     * 
     * @return tipoCalcolo
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoCalcolo getTipoCalcolo() {
        return tipoCalcolo;
    }


    /**
     * Sets the tipoCalcolo value for this ParametriCalcoloTassa.
     * 
     * @param tipoCalcolo
     */
    public void setTipoCalcolo(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoCalcolo tipoCalcolo) {
        this.tipoCalcolo = tipoCalcolo;
    }


    /**
     * Gets the regione value for this ParametriCalcoloTassa.
     * 
     * @return regione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Regione getRegione() {
        return regione;
    }


    /**
     * Sets the regione value for this ParametriCalcoloTassa.
     * 
     * @param regione
     */
    public void setRegione(it.csi.staris.pdnd.integration.service.starissrv.stub.Regione regione) {
        this.regione = regione;
    }


    /**
     * Gets the tipoTarga value for this ParametriCalcoloTassa.
     * 
     * @return tipoTarga
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga getTipoTarga() {
        return tipoTarga;
    }


    /**
     * Sets the tipoTarga value for this ParametriCalcoloTassa.
     * 
     * @param tipoTarga
     */
    public void setTipoTarga(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga) {
        this.tipoTarga = tipoTarga;
    }


    /**
     * Gets the targa value for this ParametriCalcoloTassa.
     * 
     * @return targa
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Targa getTarga() {
        return targa;
    }


    /**
     * Sets the targa value for this ParametriCalcoloTassa.
     * 
     * @param targa
     */
    public void setTarga(it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa) {
        this.targa = targa;
    }


    /**
     * Gets the scadenza value for this ParametriCalcoloTassa.
     * 
     * @return scadenza
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza getScadenza() {
        return scadenza;
    }


    /**
     * Sets the scadenza value for this ParametriCalcoloTassa.
     * 
     * @param scadenza
     */
    public void setScadenza(it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza) {
        this.scadenza = scadenza;
    }


    /**
     * Gets the validita value for this ParametriCalcoloTassa.
     * 
     * @return validita
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Validita getValidita() {
        return validita;
    }


    /**
     * Sets the validita value for this ParametriCalcoloTassa.
     * 
     * @param validita
     */
    public void setValidita(it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita) {
        this.validita = validita;
    }


    /**
     * Gets the codiceFiscale value for this ParametriCalcoloTassa.
     * 
     * @return codiceFiscale
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this ParametriCalcoloTassa.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoRiduzione value for this ParametriCalcoloTassa.
     * 
     * @return tipoRiduzione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione getTipoRiduzione() {
        return tipoRiduzione;
    }


    /**
     * Sets the tipoRiduzione value for this ParametriCalcoloTassa.
     * 
     * @param tipoRiduzione
     */
    public void setTipoRiduzione(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione) {
        this.tipoRiduzione = tipoRiduzione;
    }


    /**
     * Gets the dataPrimoRilascio value for this ParametriCalcoloTassa.
     * 
     * @return dataPrimoRilascio
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString getDataPrimoRilascio() {
        return dataPrimoRilascio;
    }


    /**
     * Sets the dataPrimoRilascio value for this ParametriCalcoloTassa.
     * 
     * @param dataPrimoRilascio
     */
    public void setDataPrimoRilascio(it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataPrimoRilascio) {
        this.dataPrimoRilascio = dataPrimoRilascio;
    }


    /**
     * Gets the modalitaCompensazione value for this ParametriCalcoloTassa.
     * 
     * @return modalitaCompensazione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.ModalitaCompensazione getModalitaCompensazione() {
        return modalitaCompensazione;
    }


    /**
     * Sets the modalitaCompensazione value for this ParametriCalcoloTassa.
     * 
     * @param modalitaCompensazione
     */
    public void setModalitaCompensazione(it.csi.staris.pdnd.integration.service.starissrv.stub.ModalitaCompensazione modalitaCompensazione) {
        this.modalitaCompensazione = modalitaCompensazione;
    }


    /**
     * Gets the tipoTargaCompensato value for this ParametriCalcoloTassa.
     * 
     * @return tipoTargaCompensato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga getTipoTargaCompensato() {
        return tipoTargaCompensato;
    }


    /**
     * Sets the tipoTargaCompensato value for this ParametriCalcoloTassa.
     * 
     * @param tipoTargaCompensato
     */
    public void setTipoTargaCompensato(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTargaCompensato) {
        this.tipoTargaCompensato = tipoTargaCompensato;
    }


    /**
     * Gets the targaCompensato value for this ParametriCalcoloTassa.
     * 
     * @return targaCompensato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Targa getTargaCompensato() {
        return targaCompensato;
    }


    /**
     * Sets the targaCompensato value for this ParametriCalcoloTassa.
     * 
     * @param targaCompensato
     */
    public void setTargaCompensato(it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targaCompensato) {
        this.targaCompensato = targaCompensato;
    }


    /**
     * Gets the scadenzaCompensato value for this ParametriCalcoloTassa.
     * 
     * @return scadenzaCompensato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza getScadenzaCompensato() {
        return scadenzaCompensato;
    }


    /**
     * Sets the scadenzaCompensato value for this ParametriCalcoloTassa.
     * 
     * @param scadenzaCompensato
     */
    public void setScadenzaCompensato(it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenzaCompensato) {
        this.scadenzaCompensato = scadenzaCompensato;
    }


    /**
     * Gets the validitaCompensato value for this ParametriCalcoloTassa.
     * 
     * @return validitaCompensato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Validita getValiditaCompensato() {
        return validitaCompensato;
    }


    /**
     * Sets the validitaCompensato value for this ParametriCalcoloTassa.
     * 
     * @param validitaCompensato
     */
    public void setValiditaCompensato(it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validitaCompensato) {
        this.validitaCompensato = validitaCompensato;
    }


    /**
     * Gets the dataEvento value for this ParametriCalcoloTassa.
     * 
     * @return dataEvento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString getDataEvento() {
        return dataEvento;
    }


    /**
     * Sets the dataEvento value for this ParametriCalcoloTassa.
     * 
     * @param dataEvento
     */
    public void setDataEvento(it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString dataEvento) {
        this.dataEvento = dataEvento;
    }


    /**
     * Gets the tipoModalitaEsenzioni value for this ParametriCalcoloTassa.
     * 
     * @return tipoModalitaEsenzioni
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoModalitaEsenzioni getTipoModalitaEsenzioni() {
        return tipoModalitaEsenzioni;
    }


    /**
     * Sets the tipoModalitaEsenzioni value for this ParametriCalcoloTassa.
     * 
     * @param tipoModalitaEsenzioni
     */
    public void setTipoModalitaEsenzioni(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoModalitaEsenzioni tipoModalitaEsenzioni) {
        this.tipoModalitaEsenzioni = tipoModalitaEsenzioni;
    }


    /**
     * Gets the calcoloRidotto value for this ParametriCalcoloTassa.
     * 
     * @return calcoloRidotto
     */
    public java.lang.String getCalcoloRidotto() {
        return calcoloRidotto;
    }


    /**
     * Sets the calcoloRidotto value for this ParametriCalcoloTassa.
     * 
     * @param calcoloRidotto
     */
    public void setCalcoloRidotto(java.lang.String calcoloRidotto) {
        this.calcoloRidotto = calcoloRidotto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriCalcoloTassa)) return false;
        ParametriCalcoloTassa other = (ParametriCalcoloTassa) obj;
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
            ((this.tipoCalcolo==null && other.getTipoCalcolo()==null) || 
             (this.tipoCalcolo!=null &&
              this.tipoCalcolo.equals(other.getTipoCalcolo()))) &&
            ((this.regione==null && other.getRegione()==null) || 
             (this.regione!=null &&
              this.regione.equals(other.getRegione()))) &&
            ((this.tipoTarga==null && other.getTipoTarga()==null) || 
             (this.tipoTarga!=null &&
              this.tipoTarga.equals(other.getTipoTarga()))) &&
            ((this.targa==null && other.getTarga()==null) || 
             (this.targa!=null &&
              this.targa.equals(other.getTarga()))) &&
            ((this.scadenza==null && other.getScadenza()==null) || 
             (this.scadenza!=null &&
              this.scadenza.equals(other.getScadenza()))) &&
            ((this.validita==null && other.getValidita()==null) || 
             (this.validita!=null &&
              this.validita.equals(other.getValidita()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.tipoRiduzione==null && other.getTipoRiduzione()==null) || 
             (this.tipoRiduzione!=null &&
              this.tipoRiduzione.equals(other.getTipoRiduzione()))) &&
            ((this.dataPrimoRilascio==null && other.getDataPrimoRilascio()==null) || 
             (this.dataPrimoRilascio!=null &&
              this.dataPrimoRilascio.equals(other.getDataPrimoRilascio()))) &&
            ((this.modalitaCompensazione==null && other.getModalitaCompensazione()==null) || 
             (this.modalitaCompensazione!=null &&
              this.modalitaCompensazione.equals(other.getModalitaCompensazione()))) &&
            ((this.tipoTargaCompensato==null && other.getTipoTargaCompensato()==null) || 
             (this.tipoTargaCompensato!=null &&
              this.tipoTargaCompensato.equals(other.getTipoTargaCompensato()))) &&
            ((this.targaCompensato==null && other.getTargaCompensato()==null) || 
             (this.targaCompensato!=null &&
              this.targaCompensato.equals(other.getTargaCompensato()))) &&
            ((this.scadenzaCompensato==null && other.getScadenzaCompensato()==null) || 
             (this.scadenzaCompensato!=null &&
              this.scadenzaCompensato.equals(other.getScadenzaCompensato()))) &&
            ((this.validitaCompensato==null && other.getValiditaCompensato()==null) || 
             (this.validitaCompensato!=null &&
              this.validitaCompensato.equals(other.getValiditaCompensato()))) &&
            ((this.dataEvento==null && other.getDataEvento()==null) || 
             (this.dataEvento!=null &&
              this.dataEvento.equals(other.getDataEvento()))) &&
            ((this.tipoModalitaEsenzioni==null && other.getTipoModalitaEsenzioni()==null) || 
             (this.tipoModalitaEsenzioni!=null &&
              this.tipoModalitaEsenzioni.equals(other.getTipoModalitaEsenzioni()))) &&
            ((this.calcoloRidotto==null && other.getCalcoloRidotto()==null) || 
             (this.calcoloRidotto!=null &&
              this.calcoloRidotto.equals(other.getCalcoloRidotto())));
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
        if (getTipoCalcolo() != null) {
            _hashCode += getTipoCalcolo().hashCode();
        }
        if (getRegione() != null) {
            _hashCode += getRegione().hashCode();
        }
        if (getTipoTarga() != null) {
            _hashCode += getTipoTarga().hashCode();
        }
        if (getTarga() != null) {
            _hashCode += getTarga().hashCode();
        }
        if (getScadenza() != null) {
            _hashCode += getScadenza().hashCode();
        }
        if (getValidita() != null) {
            _hashCode += getValidita().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getTipoRiduzione() != null) {
            _hashCode += getTipoRiduzione().hashCode();
        }
        if (getDataPrimoRilascio() != null) {
            _hashCode += getDataPrimoRilascio().hashCode();
        }
        if (getModalitaCompensazione() != null) {
            _hashCode += getModalitaCompensazione().hashCode();
        }
        if (getTipoTargaCompensato() != null) {
            _hashCode += getTipoTargaCompensato().hashCode();
        }
        if (getTargaCompensato() != null) {
            _hashCode += getTargaCompensato().hashCode();
        }
        if (getScadenzaCompensato() != null) {
            _hashCode += getScadenzaCompensato().hashCode();
        }
        if (getValiditaCompensato() != null) {
            _hashCode += getValiditaCompensato().hashCode();
        }
        if (getDataEvento() != null) {
            _hashCode += getDataEvento().hashCode();
        }
        if (getTipoModalitaEsenzioni() != null) {
            _hashCode += getTipoModalitaEsenzioni().hashCode();
        }
        if (getCalcoloRidotto() != null) {
            _hashCode += getCalcoloRidotto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriCalcoloTassa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriCalcoloTassa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCalcolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCalcolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoCalcolo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "regione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTarga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoTarga"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "targa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "scadenza"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validita");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "validita"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "codiceFiscale"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRiduzione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoRiduzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoRiduzione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPrimoRilascio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPrimoRilascio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataAsString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalitaCompensazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalitaCompensazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "modalitaCompensazione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTargaCompensato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTargaCompensato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoTarga"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targaCompensato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targaCompensato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "targa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scadenzaCompensato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scadenzaCompensato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "scadenza"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validitaCompensato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validitaCompensato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "validita"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataAsString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoModalitaEsenzioni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoModalitaEsenzioni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoModalitaEsenzioni"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcoloRidotto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calcoloRidotto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
