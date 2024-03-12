package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CompensazioneDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String modalitaCompensazione = null;
  private String targa = null;
  private String tipoTarga = null;
  private String scadenza = null;
  private Integer validita = null;
  private Date dataEvento = null;

  /**
   * modalità compensazione
   **/
  
  @ApiModelProperty(value = "modalità compensazione")
  @JsonProperty("modalita_compensazione") 
 
  public String getModalitaCompensazione() {
    return modalitaCompensazione;
  }
  public void setModalitaCompensazione(String modalitaCompensazione) {
    this.modalitaCompensazione = modalitaCompensazione;
  }

  /**
   * la targa del veicolo in compensazione
   **/
  
  @ApiModelProperty(example = "AA000BB", value = "la targa del veicolo in compensazione")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   * il tipo targa veicolo in compensazione
   **/
  
  @ApiModelProperty(example = "A= Autoveicolo, M, Motoveicolo, ecc", value = "il tipo targa veicolo in compensazione")
  @JsonProperty("tipo_targa") 
 
  public String getTipoTarga() {
    return tipoTarga;
  }
  public void setTipoTarga(String tipoTarga) {
    this.tipoTarga = tipoTarga;
  }

  /**
   * la scadenza in formato MM/YYYY veicolo in compensazione
   **/
  
  @ApiModelProperty(example = "05/2024 per indicare maggio 2004", value = "la scadenza in formato MM/YYYY veicolo in compensazione")
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
   * data evento
   **/
  
  @ApiModelProperty(value = "data evento")
  @JsonProperty("data_evento") 
 
  public Date getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensazioneDto compensazioneDto = (CompensazioneDto) o;
    return Objects.equals(modalitaCompensazione, compensazioneDto.modalitaCompensazione) &&
        Objects.equals(targa, compensazioneDto.targa) &&
        Objects.equals(tipoTarga, compensazioneDto.tipoTarga) &&
        Objects.equals(scadenza, compensazioneDto.scadenza) &&
        Objects.equals(validita, compensazioneDto.validita) &&
        Objects.equals(dataEvento, compensazioneDto.dataEvento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalitaCompensazione, targa, tipoTarga, scadenza, validita, dataEvento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensazioneDto {\n");
    
    sb.append("    modalitaCompensazione: ").append(toIndentedString(modalitaCompensazione)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoTarga: ").append(toIndentedString(tipoTarga)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validita: ").append(toIndentedString(validita)).append("\n");
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
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

