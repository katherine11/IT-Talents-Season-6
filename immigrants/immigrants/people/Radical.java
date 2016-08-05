package immigrants.people;

import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.ImmigrantWithWeaponsException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.PassportException;
import immigrants.exceptions.RadicalImmigrantException;
import immigrants.interfaces.Shootable;
import immigrants.other.Address;
import immigrants.other.City;
import immigrants.other.Passport;
import immigrants.weapons.Automat;
import immigrants.weapons.Bomb;
import immigrants.weapons.Gun;
import immigrants.weapons.Weapon;

public class Radical extends ImmigrantWithWeapons implements Shootable{

	private static final byte MAX_WEAPONS_FOR_RADICAL = 5;
	private static final float CHANCE_TO_HAVE_PASSPORT = 35f;
	private static final byte CHANCE_FOR_PASSPORT = 35;

	public Radical(int money, Address address, Passport passport) throws OutOfMoneyException, ImmigrantException, PassportException {
		super(money, address);

		if(Math.random()*100 > CHANCE_TO_HAVE_PASSPORT){
			this.setHasPassport(false);
		}
		else{
			this.setHasPassport(true);
			this.setPassport(passport);
		}
		
		Weapon [] weapons = new Weapon[MAX_WEAPONS_FOR_RADICAL];	
		this.setWeapons(weapons);
	
	
	}

	@Override
	public void setPassport(Passport passport) throws PassportException {
		byte chance = (byte) (Math.random() * 100);

		if (passport != null && chance <= CHANCE_FOR_PASSPORT) {
			super.setPassport(passport);
		} else {
			throw new PassportException("No passport given! ");
		}

	}


	public void setWeapons(Weapon[] weapons) throws ImmigrantWithWeaponsException, RadicalImmigrantException {
		if(weapons != null){
			for (int index = 0; index < weapons.length; index++) {
				if(weapons[index] instanceof Bomb){
					throw new RadicalImmigrantException("Radicals don't have bombs!");
				}
			}
			
			this.weapons = weapons.clone();

		}
		else{
			throw new RadicalImmigrantException("Invalid weapons!");
		}
	}

	@Override
	public byte shoot(City city, Weapon weapon) {
		if(weapon != null && city != null){
			if(weapon instanceof Automat || weapon instanceof Gun){
				return ((Shootable) weapon).shoot(city, weapon);
			}
		}
		return 0;
	}
	

}
