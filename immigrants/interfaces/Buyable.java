package immigrants.interfaces;
import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.weapons.Weapon;

public interface Buyable {

	void buyWeapons(Weapon [] weapons) throws OutOfMoneyException,ImmigrantException;
}
