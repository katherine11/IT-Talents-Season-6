package immigrants.interfaces;

import immigrants.exceptions.CityException;
import immigrants.people.Immigrant;

public interface Addable {

	void addImmigrant(Immigrant immigrant) throws CityException;
	
}
