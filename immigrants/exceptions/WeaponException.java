package immigrants.exceptions;

public class WeaponException extends Exception {

	private static final long serialVersionUID = -4754013598658373875L;

	public WeaponException() {}

	public WeaponException(String message, Throwable cause) {
		super(message, cause);
	}

	public WeaponException(String message) {
		super(message);
	}

	public WeaponException(Throwable cause) {
		super(cause);
	}
	
	

}
