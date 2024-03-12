package it.csi.staris.pdnd.integration.exception;

/**
 * Eccezione generica dello strato di Integration
 * @author andreafontanelli
 *
 */
public class ForbiddenException extends IntegrationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239227751072737759L;
	
	
	public ForbiddenException() {
		super();
	}

	public ForbiddenException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ForbiddenException(Throwable cause, String message) {
		super(message, cause);
	}

	public ForbiddenException(String message) {
		super(message);
	}

	public ForbiddenException(Throwable cause) {
		super(cause);
	}
	

}
