package it.csi.staris.pdnd.integration.exception;

/**
 * Eccezione generica dello strato di Integration
 * @author andreafontanelli
 *
 */
public class ValidationException extends IntegrationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239227751072737759L;
	
	
	public ValidationException() {
		super();
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ValidationException(Throwable cause, String message) {
		super(message, cause);
	}

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(Throwable cause) {
		super(cause);
	}
	

}
