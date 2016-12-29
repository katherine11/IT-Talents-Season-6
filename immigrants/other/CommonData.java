package immigrants.other;

import javax.naming.InvalidNameException;

public abstract class CommonData {

	private String name;

	public CommonData(String name) throws InvalidNameException {
		
		if (name != null && name != "") {
			this.name = name;
		}
		else{
			throw new InvalidNameException("Invalid name given!");
		}
	}

	public String getName() {
		return name;
	}
}
