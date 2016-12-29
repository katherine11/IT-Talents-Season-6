package bank.functionality;
import bank.abstraction.BankProduct;
import bank.exceptions.BankProductException;

public class Credit extends BankProduct {

	public static final int MIN_SUM_FOR_A_CREDIT = 100;
	private float payment;

	public Credit(String name, double money) throws BankProductException {
		super(name, money);
	}
	
	public Credit(double sum, byte period) throws BankProductException {
		super(sum);
		
		if(this.money < MIN_SUM_FOR_A_CREDIT){
			throw new BankProductException("Invalid ammount of money given!");
		}
		
		if(period != 0){
			this.payment = (float) (money/period);
		}
	}

	public double getPayment() {
		return this.payment;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.payment;
	}
}
