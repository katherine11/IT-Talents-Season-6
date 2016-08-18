package exceptions;

public class StorageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -966421652906095605L;

	public StorageException() {}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}

	public StorageException(String message) {
		super(message);
	}

	public StorageException(Throwable cause) {
		super(cause);
	}

	
	
}
