package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class MittenteDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String codice = null;
  private String tipoFruitore = null;
  private String idComunicazione = null;

  /**
   * codice mittente
   **/
  
  @ApiModelProperty(value = "codice mittente")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * tipo fruitore
   **/
  
  @ApiModelProperty(value = "tipo fruitore")
  @JsonProperty("tipo_fruitore") 
 
  public String getTipoFruitore() {
    return tipoFruitore;
  }
  public void setTipoFruitore(String tipoFruitore) {
    this.tipoFruitore = tipoFruitore;
  }

  /**
   * codice univoco
   **/
  
  @ApiModelProperty(value = "codice univoco")
  @JsonProperty("id_comunicazione") 
 
  public String getIdComunicazione() {
    return idComunicazione;
  }
  public void setIdComunicazione(String idComunicazione) {
    this.idComunicazione = idComunicazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MittenteDto mittenteDto = (MittenteDto) o;
    return Objects.equals(codice, mittenteDto.codice) &&
        Objects.equals(tipoFruitore, mittenteDto.tipoFruitore) &&
        Objects.equals(idComunicazione, mittenteDto.idComunicazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, tipoFruitore, idComunicazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MittenteDto {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    tipoFruitore: ").append(toIndentedString(tipoFruitore)).append("\n");
    sb.append("    idComunicazione: ").append(toIndentedString(idComunicazione)).append("\n");
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

