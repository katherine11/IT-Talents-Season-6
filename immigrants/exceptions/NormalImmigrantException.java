package immigrants.exceptions;

public class NormalImmigrantException extends ImmigrantException {

	private static final long serialVersionUID = -7199879317633259635L;

	public NormalImmigrantException() {}

	public NormalImmigrantException(String message, Throwable cause) {
		super(message, cause);
	}

	public NormalImmigrantException(String message) {
		super(message);
	}

	public NormalImmigrantException(Throwable cause) {
		super(cause);
	}

}
