package immigrants.other;

import immigrants.exceptions.AddressException;

public class Address {

	private City city;
	private Country country;
	
	public Address(Country country, City city) throws AddressException {
		if(country != null){
			this.country = country;
		}
		else{
			throw new AddressException("No country!");
		}
		
		if(city != null){
			this.city = city;
		}
		else{
			throw new AddressException("No city!");
		}
	}

	public City getCity() {
		return this.city;
	}

	public Country getCountry() {
		return this.country;
	}
	
}
