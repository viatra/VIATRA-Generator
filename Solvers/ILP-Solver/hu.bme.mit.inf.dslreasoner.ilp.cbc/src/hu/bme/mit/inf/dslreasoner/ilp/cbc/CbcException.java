package hu.bme.mit.inf.dslreasoner.ilp.cbc;

public class CbcException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2691773509078511887L;

	public CbcException() {
		super();
	}

	public CbcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CbcException(String message, Throwable cause) {
		super(message, cause);
	}

	public CbcException(String message) {
		super(message);
	}

	public CbcException(Throwable cause) {
		super(cause);
	}

}
