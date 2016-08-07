package immigrants.exceptions;

public class CityException extends Exception {

	private static final long serialVersionUID = -1550642944716325548L;

	public CityException() {}

	public CityException(String message, Throwable cause) {
		super(message, cause);
	}

	public CityException(String message) {
		super(message);
	}

	public CityException(Throwable cause) {
		super(cause);
	}

	
}
