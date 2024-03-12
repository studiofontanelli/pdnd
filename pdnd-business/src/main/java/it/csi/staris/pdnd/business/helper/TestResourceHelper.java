package it.csi.staris.pdnd.business.helper;

import org.springframework.beans.factory.InitializingBean;

import it.csi.staris.pdnd.business.exception.HelperException;
/**
 * 
 * @author andreafontanelli
 *
 */
public interface TestResourceHelper extends InitializingBean {

	
	/**
	 * 
	 * @return
	 * @throws HelperException
	 */
	public boolean testResources() throws HelperException;
	
	
	
}
