package immigrants.people;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.PassportException;
import immigrants.other.Passport;

public abstract class Citizen {
	private Passport passport;
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) throws OutOfMoneyException {
		
		if(money > 0){
			this.money = money;
		}
		else{
			throw new OutOfMoneyException("No money to add!");
		}
		
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) throws PassportException {
		if(passport != null){
			this.passport = passport;
		}
		else{
			throw new PassportException("No current passport!");
		}
	}
	
	
	




}
