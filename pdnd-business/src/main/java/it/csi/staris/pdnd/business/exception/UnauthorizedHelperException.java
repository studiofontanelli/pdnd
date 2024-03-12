package it.csi.staris.pdnd.business.exception;



/**
 * Eccezione gettata quando non si hanno i permessi per la risorsa utlizzata
 * @author andreafontanelli
 *
 */
public class UnauthorizedHelperException extends HelperException {


	/**
	 *
	 */
	private static final long serialVersionUID = 58261297403731707L;

	public UnauthorizedHelperException() {
		super();
	}

	public UnauthorizedHelperException(String message, Throwable cause) {
		super(message, cause);

	}

	public UnauthorizedHelperException(String message) {
		super(message);

	}




}