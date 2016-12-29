package immigrants.people;

import javax.naming.InvalidNameException;

import immigrants.exceptions.PoliceException;
import immigrants.interfaces.Arrestable;
import immigrants.other.Address;

public class SpecialForces extends Police {

	private static final byte CHANCE_TO_ARREST_ILLEGAL_IMMIGRANTS = 90;

	public SpecialForces(String name, Address address) throws InvalidNameException {
		super(name, address);
	}

	@Override
	public boolean check(Immigrant immigrant) throws PoliceException {

		if (immigrant != null) {
			if(immigrant instanceof Normal){
				throw new PoliceException("Unable to check normal immigrant!");
			}
			
			if (immigrant instanceof Radical) {
				if (!immigrant.isHasPassport()) {
					this.arrest(immigrant);
					return false;
				} else { // if he has a passport:
					return true;
				}
			}		
			return false;
		}
		else{
			throw new PoliceException("Cannot check the immigrant!");
		}

	}

	@Override
	public void arrest(Immigrant immigrant) throws PoliceException {
		if (Math.random() * 100 <= CHANCE_TO_ARREST_ILLEGAL_IMMIGRANTS) {
			Arrestable.arrest();
		} 
		else{
			throw new PoliceException("The police didn't manage to arrest the immigrant!");
		}
	}

}




