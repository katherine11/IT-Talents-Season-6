package immigrants.people;

import javax.naming.InvalidNameException;

import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.PoliceException;
import immigrants.interfaces.Arrestable;
import immigrants.other.Address;
import immigrants.weapons.Bomb;

public class PoliceOfficer extends Police {

	private static final byte CHANCE_TO_ARREST_ILLEGAL_IMMIGRANTS = 50;

	public PoliceOfficer(String name, Address address) throws InvalidNameException {
		super(name, address);
	}

	@Override
	public void arrest(Immigrant immigrant) throws PoliceException {

		if (immigrant != null) {

			if (Math.random() * 100 > CHANCE_TO_ARREST_ILLEGAL_IMMIGRANTS) {
				PoliceOfficer.catchAndArrest(immigrant);
			} else {// if he does not manage to catch them!
				throw new PoliceException("Did not manage to catch the immigrant!");
			}
		} else {
			try {
				throw new ImmigrantException("Immigrant doesn't exist!");
			} catch (ImmigrantException e) {
				e.printStackTrace();
				throw new PoliceException("Cannot arrest the immigrant! ", e);
			}
		}

	}

	private static void catchAndArrest(Immigrant immigrant) throws PoliceException {
		if(immigrant != null){
			if (hasBomb(immigrant)) {
				throw new PoliceException("Cannot arrest this immigrant!");
			} else {
				Arrestable.arrest();
			}
		}
			
	}

	static boolean hasBomb(Immigrant immigrant) {
		boolean hasBomb = false;

		if (immigrant != null && immigrant instanceof Extremist) {

			for (int index = 0; index < ((Extremist) immigrant).getWeapons().length; index++) {
				if (((Extremist) immigrant).getWeapons()[index] instanceof Bomb) {
					hasBomb = true;
					break;
				}
			}
		}
		
		//if he is not extremist, he does not have a bomb!
		return hasBomb;
	}

	@Override
	public boolean check(Immigrant immigrant) throws PoliceException {
		if (immigrant != null) {
			if (immigrant.isHasPassport()) {
				System.out.println("The immigrant is approved of entering the city!");
				return true;
			} else {
				arrest(immigrant);
				return false;
			}

		} else {
			try {
				throw new ImmigrantException("The immigrant does not exist!");
			} catch (ImmigrantException e) {
				e.printStackTrace();
				throw new PoliceException("Cnnot check the immigrant!");
			}
		}
		
	}

}
