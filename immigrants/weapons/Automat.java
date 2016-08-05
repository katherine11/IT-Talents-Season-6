package immigrants.weapons;

import immigrants.exceptions.WeaponException;
import immigrants.interfaces.Shootable;
import immigrants.other.City;

public class Automat extends Weapon implements Shootable {

	public Automat(int price) throws WeaponException {
		super(price);
	}

	@Override
	public byte shoot(City city, Weapon weapon) {

		if (weapon != null) {
			return (byte) (Math.random() * 100 + 50);
		}

		return 0;
	}

}
