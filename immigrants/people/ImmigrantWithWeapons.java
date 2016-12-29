package immigrants.people;

import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.OutOfMoneyException;
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
			throws OutOfMoneyException, ImmigrantException {

		if (weapons != null) {
			int totalPrice = 0;

			for (int index = 0; index < weapons.length; index++) {
				totalPrice += weapons[index].getPrice();
				
			}

			if (totalPrice < getMoney()) {
				this.weapons = weapons.clone();
			}
			else{
				throw new OutOfMoneyException("Not enough money to buy all these weapons");
			}
		}
		else {
			throw new ImmigrantException("Invalid weapons given!");
		}

	}

	public Weapon[] getWeapons() {
		return this.weapons;
	}

}
