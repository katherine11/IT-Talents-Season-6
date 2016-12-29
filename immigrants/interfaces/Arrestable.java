package immigrants.interfaces;

import immigrants.exceptions.PoliceException;
import immigrants.people.Immigrant;

public interface Arrestable {

	void arrest(Immigrant immigrant) throws PoliceException;
	static void arrest() {
		System.out.println("The immigrant is arrested!");
	}
	
}
