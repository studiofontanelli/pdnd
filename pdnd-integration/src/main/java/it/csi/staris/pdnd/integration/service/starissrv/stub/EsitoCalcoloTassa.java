/**
 * EsitoCalcoloTassa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class EsitoCalcoloTassa  implements java.io.Serializable {
    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Riduzione percentualeRiduzione;

    private java.lang.String esplicativo;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.TipoSanzionamento sanzionamento;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta tassa;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta sanzioni;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta interessi;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovuto;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta dirittoFisso;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDaVersare;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta importoCompensato;

    private java.lang.String esito;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString ultimoGiornoUtile;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoDisponibile;

    private it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovutoComp;

    public EsitoCalcoloTassa() {
    }

    public EsitoCalcoloTassa(
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita,
           it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione,
           it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Riduzione percentualeRiduzione,
           java.lang.String esplicativo,
           it.csi.staris.pdnd.integration.service.starissrv.stub.TipoSanzionamento sanzionamento,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta tassa,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta sanzioni,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta interessi,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovuto,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta dirittoFisso,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDaVersare,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta importoCompensato,
           java.lang.String esito,
           it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString ultimoGiornoUtile,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoDisponibile,
           it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovutoComp) {
           this.tipoTarga = tipoTarga;
           this.targa = targa;
           this.scadenza = scadenza;
           this.validita = validita;
           this.codiceFiscale = codiceFiscale;
           this.tipoRiduzione = tipoRiduzione;
           this.identificativoPagamento = identificativoPagamento;
           this.percentualeRiduzione = percentualeRiduzione;
           this.esplicativo = esplicativo;
           this.sanzionamento = sanzionamento;
           this.tassa = tassa;
           this.sanzioni = sanzioni;
           this.interessi = interessi;
           this.totaleDovuto = totaleDovuto;
           this.dirittoFisso = dirittoFisso;
           this.totaleDaVersare = totaleDaVersare;
           this.errori = errori;
           this.importoCompensato = importoCompensato;
           this.esito = esito;
           this.ultimoGiornoUtile = ultimoGiornoUtile;
           this.creditoDisponibile = creditoDisponibile;
           this.totaleDovutoComp = totaleDovutoComp;
    }


    /**
     * Gets the tipoTarga value for this EsitoCalcoloTassa.
     * 
     * @return tipoTarga
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga getTipoTarga() {
        return tipoTarga;
    }


    /**
     * Sets the tipoTarga value for this EsitoCalcoloTassa.
     * 
     * @param tipoTarga
     */
    public void setTipoTarga(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga tipoTarga) {
        this.tipoTarga = tipoTarga;
    }


    /**
     * Gets the targa value for this EsitoCalcoloTassa.
     * 
     * @return targa
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Targa getTarga() {
        return targa;
    }


    /**
     * Sets the targa value for this EsitoCalcoloTassa.
     * 
     * @param targa
     */
    public void setTarga(it.csi.staris.pdnd.integration.service.starissrv.stub.Targa targa) {
        this.targa = targa;
    }


    /**
     * Gets the scadenza value for this EsitoCalcoloTassa.
     * 
     * @return scadenza
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza getScadenza() {
        return scadenza;
    }


    /**
     * Sets the scadenza value for this EsitoCalcoloTassa.
     * 
     * @param scadenza
     */
    public void setScadenza(it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza scadenza) {
        this.scadenza = scadenza;
    }


    /**
     * Gets the validita value for this EsitoCalcoloTassa.
     * 
     * @return validita
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Validita getValidita() {
        return validita;
    }


    /**
     * Sets the validita value for this EsitoCalcoloTassa.
     * 
     * @param validita
     */
    public void setValidita(it.csi.staris.pdnd.integration.service.starissrv.stub.Validita validita) {
        this.validita = validita;
    }


    /**
     * Gets the codiceFiscale value for this EsitoCalcoloTassa.
     * 
     * @return codiceFiscale
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this EsitoCalcoloTassa.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoRiduzione value for this EsitoCalcoloTassa.
     * 
     * @return tipoRiduzione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione getTipoRiduzione() {
        return tipoRiduzione;
    }


    /**
     * Sets the tipoRiduzione value for this EsitoCalcoloTassa.
     * 
     * @param tipoRiduzione
     */
    public void setTipoRiduzione(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione tipoRiduzione) {
        this.tipoRiduzione = tipoRiduzione;
    }


    /**
     * Gets the identificativoPagamento value for this EsitoCalcoloTassa.
     * 
     * @return identificativoPagamento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento getIdentificativoPagamento() {
        return identificativoPagamento;
    }


    /**
     * Sets the identificativoPagamento value for this EsitoCalcoloTassa.
     * 
     * @param identificativoPagamento
     */
    public void setIdentificativoPagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento identificativoPagamento) {
        this.identificativoPagamento = identificativoPagamento;
    }


    /**
     * Gets the percentualeRiduzione value for this EsitoCalcoloTassa.
     * 
     * @return percentualeRiduzione
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Riduzione getPercentualeRiduzione() {
        return percentualeRiduzione;
    }


    /**
     * Sets the percentualeRiduzione value for this EsitoCalcoloTassa.
     * 
     * @param percentualeRiduzione
     */
    public void setPercentualeRiduzione(it.csi.staris.pdnd.integration.service.starissrv.stub.Riduzione percentualeRiduzione) {
        this.percentualeRiduzione = percentualeRiduzione;
    }


    /**
     * Gets the esplicativo value for this EsitoCalcoloTassa.
     * 
     * @return esplicativo
     */
    public java.lang.String getEsplicativo() {
        return esplicativo;
    }


    /**
     * Sets the esplicativo value for this EsitoCalcoloTassa.
     * 
     * @param esplicativo
     */
    public void setEsplicativo(java.lang.String esplicativo) {
        this.esplicativo = esplicativo;
    }


    /**
     * Gets the sanzionamento value for this EsitoCalcoloTassa.
     * 
     * @return sanzionamento
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.TipoSanzionamento getSanzionamento() {
        return sanzionamento;
    }


    /**
     * Sets the sanzionamento value for this EsitoCalcoloTassa.
     * 
     * @param sanzionamento
     */
    public void setSanzionamento(it.csi.staris.pdnd.integration.service.starissrv.stub.TipoSanzionamento sanzionamento) {
        this.sanzionamento = sanzionamento;
    }


    /**
     * Gets the tassa value for this EsitoCalcoloTassa.
     * 
     * @return tassa
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getTassa() {
        return tassa;
    }


    /**
     * Sets the tassa value for this EsitoCalcoloTassa.
     * 
     * @param tassa
     */
    public void setTassa(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta tassa) {
        this.tassa = tassa;
    }


    /**
     * Gets the sanzioni value for this EsitoCalcoloTassa.
     * 
     * @return sanzioni
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getSanzioni() {
        return sanzioni;
    }


    /**
     * Sets the sanzioni value for this EsitoCalcoloTassa.
     * 
     * @param sanzioni
     */
    public void setSanzioni(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta sanzioni) {
        this.sanzioni = sanzioni;
    }


    /**
     * Gets the interessi value for this EsitoCalcoloTassa.
     * 
     * @return interessi
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getInteressi() {
        return interessi;
    }


    /**
     * Sets the interessi value for this EsitoCalcoloTassa.
     * 
     * @param interessi
     */
    public void setInteressi(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta interessi) {
        this.interessi = interessi;
    }


    /**
     * Gets the totaleDovuto value for this EsitoCalcoloTassa.
     * 
     * @return totaleDovuto
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getTotaleDovuto() {
        return totaleDovuto;
    }


    /**
     * Sets the totaleDovuto value for this EsitoCalcoloTassa.
     * 
     * @param totaleDovuto
     */
    public void setTotaleDovuto(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovuto) {
        this.totaleDovuto = totaleDovuto;
    }


    /**
     * Gets the dirittoFisso value for this EsitoCalcoloTassa.
     * 
     * @return dirittoFisso
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getDirittoFisso() {
        return dirittoFisso;
    }


    /**
     * Sets the dirittoFisso value for this EsitoCalcoloTassa.
     * 
     * @param dirittoFisso
     */
    public void setDirittoFisso(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta dirittoFisso) {
        this.dirittoFisso = dirittoFisso;
    }


    /**
     * Gets the totaleDaVersare value for this EsitoCalcoloTassa.
     * 
     * @return totaleDaVersare
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getTotaleDaVersare() {
        return totaleDaVersare;
    }


    /**
     * Sets the totaleDaVersare value for this EsitoCalcoloTassa.
     * 
     * @param totaleDaVersare
     */
    public void setTotaleDaVersare(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDaVersare) {
        this.totaleDaVersare = totaleDaVersare;
    }


    /**
     * Gets the errori value for this EsitoCalcoloTassa.
     * 
     * @return errori
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Errori getErrori() {
        return errori;
    }


    /**
     * Sets the errori value for this EsitoCalcoloTassa.
     * 
     * @param errori
     */
    public void setErrori(it.csi.staris.pdnd.integration.service.starissrv.stub.Errori errori) {
        this.errori = errori;
    }


    /**
     * Gets the importoCompensato value for this EsitoCalcoloTassa.
     * 
     * @return importoCompensato
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getImportoCompensato() {
        return importoCompensato;
    }


    /**
     * Sets the importoCompensato value for this EsitoCalcoloTassa.
     * 
     * @param importoCompensato
     */
    public void setImportoCompensato(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta importoCompensato) {
        this.importoCompensato = importoCompensato;
    }


    /**
     * Gets the esito value for this EsitoCalcoloTassa.
     * 
     * @return esito
     */
    public java.lang.String getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this EsitoCalcoloTassa.
     * 
     * @param esito
     */
    public void setEsito(java.lang.String esito) {
        this.esito = esito;
    }


    /**
     * Gets the ultimoGiornoUtile value for this EsitoCalcoloTassa.
     * 
     * @return ultimoGiornoUtile
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString getUltimoGiornoUtile() {
        return ultimoGiornoUtile;
    }


    /**
     * Sets the ultimoGiornoUtile value for this EsitoCalcoloTassa.
     * 
     * @param ultimoGiornoUtile
     */
    public void setUltimoGiornoUtile(it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString ultimoGiornoUtile) {
        this.ultimoGiornoUtile = ultimoGiornoUtile;
    }


    /**
     * Gets the creditoDisponibile value for this EsitoCalcoloTassa.
     * 
     * @return creditoDisponibile
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getCreditoDisponibile() {
        return creditoDisponibile;
    }


    /**
     * Sets the creditoDisponibile value for this EsitoCalcoloTassa.
     * 
     * @param creditoDisponibile
     */
    public void setCreditoDisponibile(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }


    /**
     * Gets the totaleDovutoComp value for this EsitoCalcoloTassa.
     * 
     * @return totaleDovutoComp
     */
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta getTotaleDovutoComp() {
        return totaleDovutoComp;
    }


    /**
     * Sets the totaleDovutoComp value for this EsitoCalcoloTassa.
     * 
     * @param totaleDovutoComp
     */
    public void setTotaleDovutoComp(it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta totaleDovutoComp) {
        this.totaleDovutoComp = totaleDovutoComp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EsitoCalcoloTassa)) return false;
        EsitoCalcoloTassa other = (EsitoCalcoloTassa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.identificativoPagamento==null && other.getIdentificativoPagamento()==null) || 
             (this.identificativoPagamento!=null &&
              this.identificativoPagamento.equals(other.getIdentificativoPagamento()))) &&
            ((this.percentualeRiduzione==null && other.getPercentualeRiduzione()==null) || 
             (this.percentualeRiduzione!=null &&
              this.percentualeRiduzione.equals(other.getPercentualeRiduzione()))) &&
            ((this.esplicativo==null && other.getEsplicativo()==null) || 
             (this.esplicativo!=null &&
              this.esplicativo.equals(other.getEsplicativo()))) &&
            ((this.sanzionamento==null && other.getSanzionamento()==null) || 
             (this.sanzionamento!=null &&
              this.sanzionamento.equals(other.getSanzionamento()))) &&
            ((this.tassa==null && other.getTassa()==null) || 
             (this.tassa!=null &&
              this.tassa.equals(other.getTassa()))) &&
            ((this.sanzioni==null && other.getSanzioni()==null) || 
             (this.sanzioni!=null &&
              this.sanzioni.equals(other.getSanzioni()))) &&
            ((this.interessi==null && other.getInteressi()==null) || 
             (this.interessi!=null &&
              this.interessi.equals(other.getInteressi()))) &&
            ((this.totaleDovuto==null && other.getTotaleDovuto()==null) || 
             (this.totaleDovuto!=null &&
              this.totaleDovuto.equals(other.getTotaleDovuto()))) &&
            ((this.dirittoFisso==null && other.getDirittoFisso()==null) || 
             (this.dirittoFisso!=null &&
              this.dirittoFisso.equals(other.getDirittoFisso()))) &&
            ((this.totaleDaVersare==null && other.getTotaleDaVersare()==null) || 
             (this.totaleDaVersare!=null &&
              this.totaleDaVersare.equals(other.getTotaleDaVersare()))) &&
            ((this.errori==null && other.getErrori()==null) || 
             (this.errori!=null &&
              this.errori.equals(other.getErrori()))) &&
            ((this.importoCompensato==null && other.getImportoCompensato()==null) || 
             (this.importoCompensato!=null &&
              this.importoCompensato.equals(other.getImportoCompensato()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.ultimoGiornoUtile==null && other.getUltimoGiornoUtile()==null) || 
             (this.ultimoGiornoUtile!=null &&
              this.ultimoGiornoUtile.equals(other.getUltimoGiornoUtile()))) &&
            ((this.creditoDisponibile==null && other.getCreditoDisponibile()==null) || 
             (this.creditoDisponibile!=null &&
              this.creditoDisponibile.equals(other.getCreditoDisponibile()))) &&
            ((this.totaleDovutoComp==null && other.getTotaleDovutoComp()==null) || 
             (this.totaleDovutoComp!=null &&
              this.totaleDovutoComp.equals(other.getTotaleDovutoComp())));
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
        if (getIdentificativoPagamento() != null) {
            _hashCode += getIdentificativoPagamento().hashCode();
        }
        if (getPercentualeRiduzione() != null) {
            _hashCode += getPercentualeRiduzione().hashCode();
        }
        if (getEsplicativo() != null) {
            _hashCode += getEsplicativo().hashCode();
        }
        if (getSanzionamento() != null) {
            _hashCode += getSanzionamento().hashCode();
        }
        if (getTassa() != null) {
            _hashCode += getTassa().hashCode();
        }
        if (getSanzioni() != null) {
            _hashCode += getSanzioni().hashCode();
        }
        if (getInteressi() != null) {
            _hashCode += getInteressi().hashCode();
        }
        if (getTotaleDovuto() != null) {
            _hashCode += getTotaleDovuto().hashCode();
        }
        if (getDirittoFisso() != null) {
            _hashCode += getDirittoFisso().hashCode();
        }
        if (getTotaleDaVersare() != null) {
            _hashCode += getTotaleDaVersare().hashCode();
        }
        if (getErrori() != null) {
            _hashCode += getErrori().hashCode();
        }
        if (getImportoCompensato() != null) {
            _hashCode += getImportoCompensato().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getUltimoGiornoUtile() != null) {
            _hashCode += getUltimoGiornoUtile().hashCode();
        }
        if (getCreditoDisponibile() != null) {
            _hashCode += getCreditoDisponibile().hashCode();
        }
        if (getTotaleDovutoComp() != null) {
            _hashCode += getTotaleDovutoComp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EsitoCalcoloTassa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloTassa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("identificativoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "identificativoPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualeRiduzione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentualeRiduzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "riduzione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esplicativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esplicativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanzionamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sanzionamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoSanzionamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tassa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tassa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanzioni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sanzioni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interessi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interessi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDovuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaleDovuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirittoFisso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirittoFisso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDaVersare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaleDaVersare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("importoCompensato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importoCompensato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimoGiornoUtile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ultimoGiornoUtile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataAsString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditoDisponibile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditoDisponibile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDovutoComp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaleDovutoComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta"));
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
