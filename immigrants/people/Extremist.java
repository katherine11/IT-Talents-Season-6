package immigrants.people;

import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.ImmigrantWithWeaponsException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.interfaces.Explodeable;
import immigrants.other.Address;
import immigrants.other.City;
import immigrants.weapons.Bomb;

public class Extremist extends ImmigrantWithWeapons implements Explodeable {

	public Extremist(int money, Address address) throws OutOfMoneyException, ImmigrantException {
		super(money, address);

		this.setHasPassport(false);

	}

	public void explode(City city) throws ImmigrantWithWeaponsException {

		if (city != null) {
			for (int index = 0; index < getWeapons().length; index++) {
				if (getWeapons()[index] instanceof Bomb) {
					Explodeable.explode(city);
					getCurrentAddress().getCountry().removeCity(city);
				}
			}
		} else {
			throw new ImmigrantWithWeaponsException("Bomb cannot explode!");
		}
	}

//	@Override
//	public void setWeapons(Weapon[] weapons) throws ExtremistImmigrantException {
//
//		if (weapons != null) {
//			this.weapons = weapons.clone();
//		}
//		else{
//			throw new ExtremistImmigrantException("Invalid weapons!");
//		}
//
//	}

}
