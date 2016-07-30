package bank.functionality;
import bank.abstraction.BankProduct;
import bank.exceptions.BankProductException;

public class Deposit extends BankProduct {

	private float payedSum = (float) (super.money*super.interest);

	public Deposit(String name, byte period , float interest) throws BankProductException {
		super(name, period, interest);
	}

	public void setBalance(double money) {
		if (money > 0) {
			this.money = money;
		}
	}
	
	public float getPayedSum(){
		return this.payedSum;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.payedSum;
	}
	
}
