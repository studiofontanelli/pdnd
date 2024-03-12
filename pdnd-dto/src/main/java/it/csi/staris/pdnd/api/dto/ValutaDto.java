package it.csi.staris.pdnd.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ValutaDto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Integer importo = null;
  private String divisa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo") 
 
  public Integer getImporto() {
    return importo;
  }
  public void setImporto(Integer importo) {
    this.importo = importo;
  }

  /**
   * divisa
   **/
  
  @ApiModelProperty(example = "Euro = EUR", value = "divisa")
  @JsonProperty("divisa") 
 
  public String getDivisa() {
    return divisa;
  }
  public void setDivisa(String divisa) {
    this.divisa = divisa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValutaDto valutaDto = (ValutaDto) o;
    return Objects.equals(importo, valutaDto.importo) &&
        Objects.equals(divisa, valutaDto.divisa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importo, divisa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValutaDto {\n");
    
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    divisa: ").append(toIndentedString(divisa)).append("\n");
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

