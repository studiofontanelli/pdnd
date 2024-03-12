package it.csi.staris.pdnd.util;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component("dataDictionary")
public class DataDictionary {

	private Map<String, String> tipoVeicolo = new HashMap<String, String>();
	
	private Map<String, String> tipoCalcolo = new HashMap<String, String>();
	
	public Map<String, String> getTipoVeicolo() {
		return tipoVeicolo;
	}
	public void setTipoVeicolo(Map<String, String> tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
	
	public <K, V> Stream<K> keys(Map<K, V> map, V value) {
	    return map
	      .entrySet()
	      .stream()
	      .filter(entry -> value.equals(entry.getValue()))
	      .map(Map.Entry::getKey);
	}
	
	
	public <K, V> K getKeyByValue(Map<K, V> map, V code) {
		return map.entrySet()
	    		  .stream()
	    		  .filter(entry -> code.equals(entry.getValue()))
			      .map(Map.Entry::getKey)				    		   
			      .findFirst().get();		
	}
	
	
	public <K, V> V getValueByKey(Map<K, V> map, K key) {
		return map.entrySet()
	    		  .stream()
	    		  .filter(entry -> key.equals(entry.getKey()))
			      .map(Map.Entry::getValue)				    		   
			      .findFirst().get();		
	}
	public Map<String, String> getTipoCalcolo() {
		return tipoCalcolo;
	}
	public void setTipoCalcolo(Map<String, String> tipoCalcolo) {
		this.tipoCalcolo = tipoCalcolo;
	}

	
	
}
