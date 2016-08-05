package immigrants.interfaces;
import immigrants.exceptions.PoliceException;
import immigrants.people.Immigrant;

public interface Checkable {
	public boolean check(Immigrant immigrant) throws PoliceException;

}



