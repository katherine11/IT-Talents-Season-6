package immigrants.weapons;
import immigrants.exceptions.WeaponException;
import immigrants.interfaces.Explodeable;

public class Bomb extends Weapon implements Explodeable{
	
	private boolean isExploded;

	public Bomb(int price) throws WeaponException {
		super(price);
	}

	public boolean isExploded() {
		return isExploded;
	}

	public void setExploded(boolean isExploded) {
		this.isExploded = isExploded;
	}

	





	

}
