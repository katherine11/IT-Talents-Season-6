package immigrants.other;

import immigrants.exceptions.CityException;
import immigrants.interfaces.Addable;
import immigrants.interfaces.Sortable;
import immigrants.people.Citizen;
import immigrants.people.Immigrant;
import immigrants.people.Police;

public class City extends CommonData implements Addable {

	private static final long MAX_POPULATION = 100_000;
	private Police[] police;
	private long population;
	private Citizen[] citizens = new Citizen [(int) MAX_POPULATION];// there are citizens and immigrants;

	public City(String name, long population, Police[] police) throws CityException {
		super(name);
		
		if(population > 0){
			this.population = population;
		}
		else{
			throw new CityException("No population to set to the city!");
		}
		
		if(police != null){
			this.police = police.clone();
		}
		else{
			throw new CityException("Invalid police to add to the city!");
		}
		
	}
	

	public City(String name) {
		super(name);
	}


	void reducePopulation(int size) {
		this.population -= size;
	}

	@Override
	public boolean equals(Object other) {
		return this.getName().equals(((CommonData) other).getName()) && this.population == ((City) other).population;
	}
	
	public void removeImmigrant(Immigrant immigrant) throws CityException {

		if (immigrant != null) {
			for (int index = 0; index < this.citizens.length; index++) {
				if ((this.citizens[index] instanceof Immigrant) && (this.citizens[index].equals(immigrant))) {
					if (index == this.citizens.length - 1) {
						this.citizens[index] = null;
					} else {
						this.citizens[index] = this.citizens[index + 1];
					}
				}
			}
		}
		
		else{
			throw new CityException("No immigrant to remove! ");
		}
	}
	
	@Override
	public void addImmigrant(Immigrant immigrant) throws CityException {
		
		if(immigrant != null){
			
			if(this.population <= MAX_POPULATION){
				this.citizens[(int) this.population] = immigrant;
				this.population++;
			}		
		}
		else{
			throw new CityException("Cannot add immigrant because he doesn't exist! ");
		}	
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	public long getPopulation() {
		return population;
	}


	

}
