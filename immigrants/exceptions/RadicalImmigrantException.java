package immigrants.exceptions;

public class RadicalImmigrantException extends ImmigrantException {

	private static final long serialVersionUID = 4366916434748427504L;

	public RadicalImmigrantException() {}

	public RadicalImmigrantException(String message, Throwable cause) {
		super(message, cause);
	}

	public RadicalImmigrantException(String message) {
		super(message);
	}

	public RadicalImmigrantException(Throwable cause) {
		super(cause);
	}

}
