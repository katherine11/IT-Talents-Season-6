package immigrants.interfaces;

import immigrants.exceptions.CityException;
import immigrants.other.City;
import immigrants.people.Immigrant;

public interface Removable {

	void removeImmigrant(Immigrant immigrant) throws CityException;
	void removeCity(City city);
}
