package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class EsitoPagamentoDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String esito = null;
  private Date dataPagamento = null;
  private List<ErroreEsitoDto> errori = new ArrayList<>();

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
   * data pagamento
   **/
  
  @ApiModelProperty(value = "data pagamento")
  @JsonProperty("data_pagamento") 
 
  public Date getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  /**
   * eventuali errori del pagamento
   **/
  
  @ApiModelProperty(value = "eventuali errori del pagamento")
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
    EsitoPagamentoDto esitoPagamentoDto = (EsitoPagamentoDto) o;
    return Objects.equals(esito, esitoPagamentoDto.esito) &&
        Objects.equals(dataPagamento, esitoPagamentoDto.dataPagamento) &&
        Objects.equals(errori, esitoPagamentoDto.errori);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esito, dataPagamento, errori);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoPagamentoDto {\n");
    
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
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

