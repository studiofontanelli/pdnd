package it.csi.staris.pdnd.integration.exception;

/**
 * Eccezione generica dello strato di Integration
 * @author andreafontanelli
 *
 */
public class NotFoundException extends IntegrationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239227751072737759L;
	
	
	public NotFoundException() {
		super();
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public NotFoundException(Throwable cause, String message) {
		super(message, cause);
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Throwable cause) {
		super(cause);
	}
	

}
