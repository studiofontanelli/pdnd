package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class EsitoPagamentoIUVDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String esito = null;
  private String iuv = null;
  private Integer totale = null;
  private String codiceFiscaleEnte = null;
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
   * Importo totale
   **/
  
  @ApiModelProperty(value = "Importo totale")
  @JsonProperty("totale") 
 
  public Integer getTotale() {
    return totale;
  }
  public void setTotale(Integer totale) {
    this.totale = totale;
  }

  /**
   * CF Ente
   **/
  
  @ApiModelProperty(value = "CF Ente")
  @JsonProperty("codice_fiscale_ente") 
 
  public String getCodiceFiscaleEnte() {
    return codiceFiscaleEnte;
  }
  public void setCodiceFiscaleEnte(String codiceFiscaleEnte) {
    this.codiceFiscaleEnte = codiceFiscaleEnte;
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
    EsitoPagamentoIUVDto esitoPagamentoIUVDto = (EsitoPagamentoIUVDto) o;
    return Objects.equals(esito, esitoPagamentoIUVDto.esito) &&
        Objects.equals(iuv, esitoPagamentoIUVDto.iuv) &&
        Objects.equals(totale, esitoPagamentoIUVDto.totale) &&
        Objects.equals(codiceFiscaleEnte, esitoPagamentoIUVDto.codiceFiscaleEnte) &&
        Objects.equals(errori, esitoPagamentoIUVDto.errori);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esito, iuv, totale, codiceFiscaleEnte, errori);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoPagamentoIUVDto {\n");
    
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    iuv: ").append(toIndentedString(iuv)).append("\n");
    sb.append("    totale: ").append(toIndentedString(totale)).append("\n");
    sb.append("    codiceFiscaleEnte: ").append(toIndentedString(codiceFiscaleEnte)).append("\n");
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

