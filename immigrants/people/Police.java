package immigrants.people;
import immigrants.exceptions.PoliceException;
import immigrants.interfaces.Arrestable;
import immigrants.interfaces.Checkable;
import immigrants.other.Address;
import immigrants.other.CommonData;

public abstract class Police extends CommonData implements Checkable, Arrestable{
	
	private Address workAddress;
	
	public Police(String name, Address address) {
		super(name);
		
		if(address != null){
			this.workAddress = address;
		}
	}	
	
	public boolean managedToCheck(Immigrant immigrant) throws PoliceException{
		return check(immigrant);
	}
	
	

}
