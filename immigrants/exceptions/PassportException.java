package immigrants.exceptions;

public class PassportException extends Exception {

	private static final long serialVersionUID = -6346355479173600622L;

	public PassportException() {}

	public PassportException(String message, Throwable cause) {
		super(message, cause);
	}

	public PassportException(String message) {
		super(message);
	}

	public PassportException(Throwable cause) {
		super(cause);
	}

}
