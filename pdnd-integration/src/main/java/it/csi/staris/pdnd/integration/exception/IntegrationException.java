package it.csi.staris.pdnd.integration.exception;

/**
 * Eccezione generica dello strato di Integration
 * @author andreafontanelli
 *
 */
public class IntegrationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5978359615581206007L;

	public IntegrationException() {
		super();
	}

	public IntegrationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public IntegrationException(Throwable cause, String message) {
		super(message, cause);
	}

	public IntegrationException(String message) {
		super(message);
	}

	public IntegrationException(Throwable cause) {
		super(cause);
	}

	

}
