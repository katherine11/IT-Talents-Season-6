package immigrants.exceptions;

public class PoliceException extends Exception {

	private static final long serialVersionUID = -2362801786863854477L;

	public PoliceException() {}

	public PoliceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PoliceException(String message) {
		super(message);
	}

	public PoliceException(Throwable cause) {
		super(cause);
	}
	

}
