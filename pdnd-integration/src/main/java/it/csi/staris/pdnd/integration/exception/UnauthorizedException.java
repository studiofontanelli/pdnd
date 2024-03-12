package it.csi.staris.pdnd.integration.exception;

/**
 * Eccezione generica dello strato di Integration
 * @author andreafontanelli
 *
 */
public class UnauthorizedException extends IntegrationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239227751072737759L;
	
	
	public UnauthorizedException() {
		super();
	}

	public UnauthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UnauthorizedException(Throwable cause, String message) {
		super(message, cause);
	}

	public UnauthorizedException(String message) {
		super(message);
	}

	public UnauthorizedException(Throwable cause) {
		super(cause);
	}
	

}
