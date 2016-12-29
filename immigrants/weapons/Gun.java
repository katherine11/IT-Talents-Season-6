package immigrants.weapons;
import immigrants.exceptions.WeaponException;
import immigrants.interfaces.Shootable;
import immigrants.other.City;

public class Gun extends Weapon implements Shootable{
	
	public Gun(int price) throws WeaponException {
		super(price);
	}

	@Override
	public byte shoot(City city, Weapon weapon) {
		
		if(weapon != null){
			return (byte) (Math.random()*50 + 20);
		}
		
		return 0;
	}		
	

	

}
