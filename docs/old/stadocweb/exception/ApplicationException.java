package it.csi.staris.pdnd.exception;

/**
 * @author andreafontanelli
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1924852710233061982L;

	public ApplicationException() {
		super();

	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);

	}

	public ApplicationException(String message) {
		super(message);

	}

	public ApplicationException(Throwable cause) {
		super(cause);

	}



}