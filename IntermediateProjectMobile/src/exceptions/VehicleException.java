package exceptions;

public class VehicleException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8835907694328549418L;

	public VehicleException() {
		
	}

	public VehicleException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public VehicleException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public VehicleException(String arg0) {
		super(arg0);
	}

	public VehicleException(Throwable arg0) {
		super(arg0);
	}
	
	

}
