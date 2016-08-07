package immigrants.exceptions;

public class OutOfMoneyException extends Exception {

	private static final long serialVersionUID = -8196438219387146256L;

	public OutOfMoneyException() {}

	public OutOfMoneyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OutOfMoneyException(String arg0) {
		super(arg0);
	}

	public OutOfMoneyException(Throwable arg0) {
		super(arg0);
	}

}
