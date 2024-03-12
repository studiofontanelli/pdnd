package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ParametriPagamentoDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private MittenteDto mittente = null;
  private String identificativoPagamento = null;
  private String iuv = null;
  private String transazioneEnte = null;
  private String numeroRicevuta = null;
  private ValutaDto speseEsazione = null;
  private String transazionePos = null;
  private ValutaDto creditoUtilizzato = null;

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
   * identificativo pagamento
   **/
  
  @ApiModelProperty(value = "identificativo pagamento")
  @JsonProperty("identificativo_pagamento") 
 
  public String getIdentificativoPagamento() {
    return identificativoPagamento;
  }
  public void setIdentificativoPagamento(String identificativoPagamento) {
    this.identificativoPagamento = identificativoPagamento;
  }

  /**
   * Identificativo Univoco Pagamento
   **/
  
  @ApiModelProperty(value = "Identificativo Univoco Pagamento")
  @JsonProperty("iuv") 
 
  public String getIuv() {
    return iuv;
  }
  public void setIuv(String iuv) {
    this.iuv = iuv;
  }

  /**
   * transazione ente
   **/
  
  @ApiModelProperty(value = "transazione ente")
  @JsonProperty("transazione_ente") 
 
  public String getTransazioneEnte() {
    return transazioneEnte;
  }
  public void setTransazioneEnte(String transazioneEnte) {
    this.transazioneEnte = transazioneEnte;
  }

  /**
   * numero ricevuta
   **/
  
  @ApiModelProperty(value = "numero ricevuta")
  @JsonProperty("numero_ricevuta") 
 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }

  /**
   * spese di esazione
   **/
  
  @ApiModelProperty(value = "spese di esazione")
  @JsonProperty("spese_esazione") 
 
  public ValutaDto getSpeseEsazione() {
    return speseEsazione;
  }
  public void setSpeseEsazione(ValutaDto speseEsazione) {
    this.speseEsazione = speseEsazione;
  }

  /**
   * transazione pos
   **/
  
  @ApiModelProperty(value = "transazione pos")
  @JsonProperty("transazione_pos") 
 
  public String getTransazionePos() {
    return transazionePos;
  }
  public void setTransazionePos(String transazionePos) {
    this.transazionePos = transazionePos;
  }

  /**
   * credito utilizzato
   **/
  
  @ApiModelProperty(value = "credito utilizzato")
  @JsonProperty("credito_utilizzato") 
 
  public ValutaDto getCreditoUtilizzato() {
    return creditoUtilizzato;
  }
  public void setCreditoUtilizzato(ValutaDto creditoUtilizzato) {
    this.creditoUtilizzato = creditoUtilizzato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametriPagamentoDto parametriPagamentoDto = (ParametriPagamentoDto) o;
    return Objects.equals(mittente, parametriPagamentoDto.mittente) &&
        Objects.equals(identificativoPagamento, parametriPagamentoDto.identificativoPagamento) &&
        Objects.equals(iuv, parametriPagamentoDto.iuv) &&
        Objects.equals(transazioneEnte, parametriPagamentoDto.transazioneEnte) &&
        Objects.equals(numeroRicevuta, parametriPagamentoDto.numeroRicevuta) &&
        Objects.equals(speseEsazione, parametriPagamentoDto.speseEsazione) &&
        Objects.equals(transazionePos, parametriPagamentoDto.transazionePos) &&
        Objects.equals(creditoUtilizzato, parametriPagamentoDto.creditoUtilizzato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mittente, identificativoPagamento, iuv, transazioneEnte, numeroRicevuta, speseEsazione, transazionePos, creditoUtilizzato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametriPagamentoDto {\n");
    
    sb.append("    mittente: ").append(toIndentedString(mittente)).append("\n");
    sb.append("    identificativoPagamento: ").append(toIndentedString(identificativoPagamento)).append("\n");
    sb.append("    iuv: ").append(toIndentedString(iuv)).append("\n");
    sb.append("    transazioneEnte: ").append(toIndentedString(transazioneEnte)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
    sb.append("    speseEsazione: ").append(toIndentedString(speseEsazione)).append("\n");
    sb.append("    transazionePos: ").append(toIndentedString(transazionePos)).append("\n");
    sb.append("    creditoUtilizzato: ").append(toIndentedString(creditoUtilizzato)).append("\n");
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

