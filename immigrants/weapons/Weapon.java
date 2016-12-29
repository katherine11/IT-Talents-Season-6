package immigrants.weapons;

import immigrants.exceptions.WeaponException;

public abstract class Weapon {

	private int price;
	private boolean sold = false;
	
	public Weapon(int price) throws WeaponException {
		if(price > 0){
			this.price = price;
		}
		else{
			throw new WeaponException("Invalid price given!");
		}
	}

	
	public static boolean allWeaponsSold(Weapon [] weapons) {
		for (int index = 0; index < weapons.length; index++) {
			if (!weapons[index].isSold()) {
				return false;
			}
		}
		return true;
	}

	public int getPrice() {
		return price;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	
}

