package immigrants.people;

import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.ImmigrantWithWeaponsException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.RadicalImmigrantException;
import immigrants.interfaces.Buyable;
import immigrants.other.Address;
import immigrants.weapons.Weapon;

public abstract class ImmigrantWithWeapons extends Immigrant implements Buyable {

	protected Weapon[] weapons;

	public ImmigrantWithWeapons(int money, Address address) throws OutOfMoneyException, ImmigrantException {
		super(money, address);
	}

	@Override
	public void buyWeapons(Weapon[] weapons)
			throws ImmigrantWithWeaponsException, RadicalImmigrantException, OutOfMoneyException {

		if (weapons != null) {
			int totalPrice = 0;

			for (int index = 0; index < weapons.length; index++) {
				if (weapons[index] != null) {
					totalPrice += weapons[index].getPrice();
				}
			}

			if (totalPrice < getMoney()) {
				this.setWeapons(weapons.clone());
			}
		}

	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public abstract void setWeapons(Weapon[] weapons) throws ImmigrantWithWeaponsException, RadicalImmigrantException;

//	public void setPassport(Passport passport) {
//		
//		super.setPassport(passport);
//	}

}
