package immigrants.people;
import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.NormalImmigrantException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.PassportException;
import immigrants.other.Address;
import immigrants.other.Passport;


public class Normal extends Immigrant {

	private static final int MAX_NORMAL_RELATIVES = 10;

	public Normal(int money, Address address, Passport passport) throws OutOfMoneyException, ImmigrantException, PassportException {
		super(money,address);
		
		this.setHasPassport(true);
		
//		if(getRelatives().length > MAX_NORMAL_RELATIVES){
//			Immigrant [] newRelatives = new Immigrant[MAX_NORMAL_RELATIVES];
//			this.setRelatives(newRelatives);
//			throw new NormalImmigrantException("Normal immigrants have max " + MAX_NORMAL_RELATIVES + "relatives!");
//		}
		
		this.setPassport(passport);
		
	}

	public Normal(Passport passport) throws PassportException {
		super(passport);
	}

}

