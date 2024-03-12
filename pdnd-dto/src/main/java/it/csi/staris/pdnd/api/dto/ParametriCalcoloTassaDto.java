package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ParametriCalcoloTassaDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private MittenteDto mittente = null;
  private String targa = null;
  private String tipoTarga = null;
  private String tipoCalcolo = null;
  private String scadenza = null;
  private Integer validita = null;
  private String codiceTipoRiduzione = null;
  private CompensazioneDto compensazione = null;
  private Boolean calcoloRidotto = null;

  /**
   * Il mettente che effettua il calcolo
   **/
  
  @ApiModelProperty(value = "Il mettente che effettua il calcolo")
  @JsonProperty("mittente") 
 
  public MittenteDto getMittente() {
    return mittente;
  }
  public void setMittente(MittenteDto mittente) {
    this.mittente = mittente;
  }

  /**
   * la targa del veicolo
   **/
  
  @ApiModelProperty(example = "AA000BB", value = "la targa del veicolo")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   * il tipo targa veicolo
   **/
  
  @ApiModelProperty(example = "A= Autoveicolo, M, Motoveicolo, ecc", value = "il tipo targa veicolo")
  @JsonProperty("tipo_targa") 
 
  public String getTipoTarga() {
    return tipoTarga;
  }
  public void setTipoTarga(String tipoTarga) {
    this.tipoTarga = tipoTarga;
  }

  /**
   * il tipo calcolo
   **/
  
  @ApiModelProperty(example = "Valori disponibili in TipoCalcolo (RICHIESTA[RIC], PROPOSTA[PRO])", value = "il tipo calcolo")
  @JsonProperty("tipo_calcolo") 
 
  public String getTipoCalcolo() {
    return tipoCalcolo;
  }
  public void setTipoCalcolo(String tipoCalcolo) {
    this.tipoCalcolo = tipoCalcolo;
  }

  /**
   * la scadenza in formato MM/YYYY
   **/
  
  @ApiModelProperty(example = "05/2024 per indicare maggio 2004", value = "la scadenza in formato MM/YYYY")
  @JsonProperty("scadenza") 
 
  public String getScadenza() {
    return scadenza;
  }
  public void setScadenza(String scadenza) {
    this.scadenza = scadenza;
  }

  /**
   * la validità espressa in mesi
   **/
  
  @ApiModelProperty(value = "la validità espressa in mesi")
  @JsonProperty("validita") 
 
  public Integer getValidita() {
    return validita;
  }
  public void setValidita(Integer validita) {
    this.validita = validita;
  }

  /**
   * codice tipo riduzione
   **/
  
  @ApiModelProperty(value = "codice tipo riduzione")
  @JsonProperty("codice_tipo_riduzione") 
 
  public String getCodiceTipoRiduzione() {
    return codiceTipoRiduzione;
  }
  public void setCodiceTipoRiduzione(String codiceTipoRiduzione) {
    this.codiceTipoRiduzione = codiceTipoRiduzione;
  }

  /**
   * Eventuale compensazione
   **/
  
  @ApiModelProperty(value = "Eventuale compensazione")
  @JsonProperty("compensazione") 
 
  public CompensazioneDto getCompensazione() {
    return compensazione;
  }
  public void setCompensazione(CompensazioneDto compensazione) {
    this.compensazione = compensazione;
  }

  /**
   * indica se viene applicato il calcolo ridotto
   **/
  
  @ApiModelProperty(value = "indica se viene applicato il calcolo ridotto")
  @JsonProperty("calcolo_ridotto") 
 
  public Boolean isCalcoloRidotto() {
    return calcoloRidotto;
  }
  public void setCalcoloRidotto(Boolean calcoloRidotto) {
    this.calcoloRidotto = calcoloRidotto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametriCalcoloTassaDto parametriCalcoloTassaDto = (ParametriCalcoloTassaDto) o;
    return Objects.equals(mittente, parametriCalcoloTassaDto.mittente) &&
        Objects.equals(targa, parametriCalcoloTassaDto.targa) &&
        Objects.equals(tipoTarga, parametriCalcoloTassaDto.tipoTarga) &&
        Objects.equals(tipoCalcolo, parametriCalcoloTassaDto.tipoCalcolo) &&
        Objects.equals(scadenza, parametriCalcoloTassaDto.scadenza) &&
        Objects.equals(validita, parametriCalcoloTassaDto.validita) &&
        Objects.equals(codiceTipoRiduzione, parametriCalcoloTassaDto.codiceTipoRiduzione) &&
        Objects.equals(compensazione, parametriCalcoloTassaDto.compensazione) &&
        Objects.equals(calcoloRidotto, parametriCalcoloTassaDto.calcoloRidotto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mittente, targa, tipoTarga, tipoCalcolo, scadenza, validita, codiceTipoRiduzione, compensazione, calcoloRidotto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametriCalcoloTassaDto {\n");
    
    sb.append("    mittente: ").append(toIndentedString(mittente)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoTarga: ").append(toIndentedString(tipoTarga)).append("\n");
    sb.append("    tipoCalcolo: ").append(toIndentedString(tipoCalcolo)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validita: ").append(toIndentedString(validita)).append("\n");
    sb.append("    codiceTipoRiduzione: ").append(toIndentedString(codiceTipoRiduzione)).append("\n");
    sb.append("    compensazione: ").append(toIndentedString(compensazione)).append("\n");
    sb.append("    calcoloRidotto: ").append(toIndentedString(calcoloRidotto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

