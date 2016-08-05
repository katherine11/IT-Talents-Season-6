package immigrants.other;

import immigrants.exceptions.CityException;
import immigrants.exceptions.CountryException;
import immigrants.interfaces.Removable;
import immigrants.people.Immigrant;

public class Country extends CommonData implements Removable{

	private City[] cities;

	public Country(String name, City[] cities) throws CountryException {
		super(name);
		
		if(cities != null){
			this.cities = cities.clone();
		}
		else{
			try {
				throw new CityException("Invalid array of cities! Cannot be added to the country!");
			} catch (CityException e) {
				e.printStackTrace();
				throw new CountryException("Cannot add a city right now!",e);
			}
		}
		
	}

	public void removeCity(City city) {

		for (int index = 0; index < this.cities.length; index++) {
			if (this.cities[index].equals(city)) {
				if (index == this.cities.length - 1) {
					this.cities[index] = null;
				} else {
					this.cities[index] = this.cities[index + 1];
				}
			}
		}

	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	@Override
	public void removeImmigrant(Immigrant immigrant) throws CityException {

		for (int index = 0; index < this.cities.length; index++) {
			if(this.cities[index].equals(immigrant.getCurrentAddress().getCity())){
				this.cities[index].removeImmigrant(immigrant);
			}
		}	
	}

}
