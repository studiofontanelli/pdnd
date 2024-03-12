package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class EsitoCalcoloTassaDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String targa = null;
  private String tipoTarga = null;
  private String scadenza = null;
  private Integer validita = null;
  private String codiceFiscale = null;
  private String tipoRiduzione = null;
  private String identificativoPagamento = null;
  private String riduzione = null;
  private String esplicativo = null;
  private String tipoSanzionamento = null;
  private ValutaDto tassa = null;
  private ValutaDto sanzioni = null;
  private ValutaDto interessi = null;
  private ValutaDto totaleDovuto = null;
  private ValutaDto totaleDaVersare = null;
  private String esito = null;
  private Date ultimoGiornoUtile = null;
  private List<ErroreEsitoDto> errori = new ArrayList<>();

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
   * Il codice fiscale intestatario
   **/
  
  @ApiModelProperty(value = "Il codice fiscale intestatario")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * codice tipo riduzione
   **/
  
  @ApiModelProperty(value = "codice tipo riduzione")
  @JsonProperty("tipo_riduzione") 
 
  public String getTipoRiduzione() {
    return tipoRiduzione;
  }
  public void setTipoRiduzione(String tipoRiduzione) {
    this.tipoRiduzione = tipoRiduzione;
  }

  /**
   * identificativo
   **/
  
  @ApiModelProperty(value = "identificativo")
  @JsonProperty("identificativo_pagamento") 
 
  public String getIdentificativoPagamento() {
    return identificativoPagamento;
  }
  public void setIdentificativoPagamento(String identificativoPagamento) {
    this.identificativoPagamento = identificativoPagamento;
  }

  /**
   * la riduzione
   **/
  
  @ApiModelProperty(value = "la riduzione")
  @JsonProperty("riduzione") 
 
  public String getRiduzione() {
    return riduzione;
  }
  public void setRiduzione(String riduzione) {
    this.riduzione = riduzione;
  }

  /**
   * esplicativo
   **/
  
  @ApiModelProperty(value = "esplicativo")
  @JsonProperty("esplicativo") 
 
  public String getEsplicativo() {
    return esplicativo;
  }
  public void setEsplicativo(String esplicativo) {
    this.esplicativo = esplicativo;
  }

  /**
   * tipo sanzionamento
   **/
  
  @ApiModelProperty(value = "tipo sanzionamento")
  @JsonProperty("tipo_sanzionamento") 
 
  public String getTipoSanzionamento() {
    return tipoSanzionamento;
  }
  public void setTipoSanzionamento(String tipoSanzionamento) {
    this.tipoSanzionamento = tipoSanzionamento;
  }

  /**
   * tassa
   **/
  
  @ApiModelProperty(value = "tassa")
  @JsonProperty("tassa") 
 
  public ValutaDto getTassa() {
    return tassa;
  }
  public void setTassa(ValutaDto tassa) {
    this.tassa = tassa;
  }

  /**
   * sanzioni
   **/
  
  @ApiModelProperty(value = "sanzioni")
  @JsonProperty("sanzioni") 
 
  public ValutaDto getSanzioni() {
    return sanzioni;
  }
  public void setSanzioni(ValutaDto sanzioni) {
    this.sanzioni = sanzioni;
  }

  /**
   * interessi
   **/
  
  @ApiModelProperty(value = "interessi")
  @JsonProperty("interessi") 
 
  public ValutaDto getInteressi() {
    return interessi;
  }
  public void setInteressi(ValutaDto interessi) {
    this.interessi = interessi;
  }

  /**
   * totale dovuto
   **/
  
  @ApiModelProperty(value = "totale dovuto")
  @JsonProperty("totale_dovuto") 
 
  public ValutaDto getTotaleDovuto() {
    return totaleDovuto;
  }
  public void setTotaleDovuto(ValutaDto totaleDovuto) {
    this.totaleDovuto = totaleDovuto;
  }

  /**
   * totale da versare
   **/
  
  @ApiModelProperty(value = "totale da versare")
  @JsonProperty("totale_da_versare") 
 
  public ValutaDto getTotaleDaVersare() {
    return totaleDaVersare;
  }
  public void setTotaleDaVersare(ValutaDto totaleDaVersare) {
    this.totaleDaVersare = totaleDaVersare;
  }

  /**
   * esito
   **/
  
  @ApiModelProperty(value = "esito")
  @JsonProperty("esito") 
 
  public String getEsito() {
    return esito;
  }
  public void setEsito(String esito) {
    this.esito = esito;
  }

  /**
   * ultimo giorno utile
   **/
  
  @ApiModelProperty(value = "ultimo giorno utile")
  @JsonProperty("ultimo_giorno_utile") 
 
  public Date getUltimoGiornoUtile() {
    return ultimoGiornoUtile;
  }
  public void setUltimoGiornoUtile(Date ultimoGiornoUtile) {
    this.ultimoGiornoUtile = ultimoGiornoUtile;
  }

  /**
   * eventuali errori del calcolo tassa
   **/
  
  @ApiModelProperty(value = "eventuali errori del calcolo tassa")
  @JsonProperty("errori") 
 
  public List<ErroreEsitoDto> getErrori() {
    return errori;
  }
  public void setErrori(List<ErroreEsitoDto> errori) {
    this.errori = errori;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsitoCalcoloTassaDto esitoCalcoloTassaDto = (EsitoCalcoloTassaDto) o;
    return Objects.equals(targa, esitoCalcoloTassaDto.targa) &&
        Objects.equals(tipoTarga, esitoCalcoloTassaDto.tipoTarga) &&
        Objects.equals(scadenza, esitoCalcoloTassaDto.scadenza) &&
        Objects.equals(validita, esitoCalcoloTassaDto.validita) &&
        Objects.equals(codiceFiscale, esitoCalcoloTassaDto.codiceFiscale) &&
        Objects.equals(tipoRiduzione, esitoCalcoloTassaDto.tipoRiduzione) &&
        Objects.equals(identificativoPagamento, esitoCalcoloTassaDto.identificativoPagamento) &&
        Objects.equals(riduzione, esitoCalcoloTassaDto.riduzione) &&
        Objects.equals(esplicativo, esitoCalcoloTassaDto.esplicativo) &&
        Objects.equals(tipoSanzionamento, esitoCalcoloTassaDto.tipoSanzionamento) &&
        Objects.equals(tassa, esitoCalcoloTassaDto.tassa) &&
        Objects.equals(sanzioni, esitoCalcoloTassaDto.sanzioni) &&
        Objects.equals(interessi, esitoCalcoloTassaDto.interessi) &&
        Objects.equals(totaleDovuto, esitoCalcoloTassaDto.totaleDovuto) &&
        Objects.equals(totaleDaVersare, esitoCalcoloTassaDto.totaleDaVersare) &&
        Objects.equals(esito, esitoCalcoloTassaDto.esito) &&
        Objects.equals(ultimoGiornoUtile, esitoCalcoloTassaDto.ultimoGiornoUtile) &&
        Objects.equals(errori, esitoCalcoloTassaDto.errori);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targa, tipoTarga, scadenza, validita, codiceFiscale, tipoRiduzione, identificativoPagamento, riduzione, esplicativo, tipoSanzionamento, tassa, sanzioni, interessi, totaleDovuto, totaleDaVersare, esito, ultimoGiornoUtile, errori);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoCalcoloTassaDto {\n");
    
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoTarga: ").append(toIndentedString(tipoTarga)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validita: ").append(toIndentedString(validita)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    tipoRiduzione: ").append(toIndentedString(tipoRiduzione)).append("\n");
    sb.append("    identificativoPagamento: ").append(toIndentedString(identificativoPagamento)).append("\n");
    sb.append("    riduzione: ").append(toIndentedString(riduzione)).append("\n");
    sb.append("    esplicativo: ").append(toIndentedString(esplicativo)).append("\n");
    sb.append("    tipoSanzionamento: ").append(toIndentedString(tipoSanzionamento)).append("\n");
    sb.append("    tassa: ").append(toIndentedString(tassa)).append("\n");
    sb.append("    sanzioni: ").append(toIndentedString(sanzioni)).append("\n");
    sb.append("    interessi: ").append(toIndentedString(interessi)).append("\n");
    sb.append("    totaleDovuto: ").append(toIndentedString(totaleDovuto)).append("\n");
    sb.append("    totaleDaVersare: ").append(toIndentedString(totaleDaVersare)).append("\n");
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    ultimoGiornoUtile: ").append(toIndentedString(ultimoGiornoUtile)).append("\n");
    sb.append("    errori: ").append(toIndentedString(errori)).append("\n");
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

