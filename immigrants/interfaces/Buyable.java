package immigrants.interfaces;
import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.ImmigrantWithWeaponsException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.RadicalImmigrantException;
import immigrants.weapons.Weapon;

public interface Buyable {

	void buyWeapons(Weapon [] weapons) throws OutOfMoneyException,ImmigrantException;
}
