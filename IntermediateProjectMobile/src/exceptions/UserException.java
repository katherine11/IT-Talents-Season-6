package exceptions;

public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1862608559963555680L;

	public UserException() {
	}

	public UserException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserException(String message) {
		super(message);
	}

	public UserException(Throwable cause) {
		super(cause);
	}

}
