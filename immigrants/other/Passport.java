package immigrants.other;

import javax.naming.InvalidNameException;

public class Passport extends CommonData {

	@SuppressWarnings("unused")
	private byte age;
	@SuppressWarnings("unused")
	private Address birthAddress;
	
	public Passport(String name) throws InvalidNameException {
		super(name);
	}
		
	

}

