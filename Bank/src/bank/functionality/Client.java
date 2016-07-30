package bank.functionality;
import java.util.ArrayList;
import java.util.List;
import bank.abstraction.*;
import bank.exceptions.*;

public class Client extends ContactInfo implements IClient {
	
	private static final int MIN_SALARY_IN_BULGARIA = 400;
	private float salary;
	private List<Deposit> deposits = new ArrayList<Deposit>();
	private List<Credit> credits = new ArrayList<Credit>();
	
	public Client(String name, double balance, float salary) throws ClientException, ContactInfoException {
		super(name, balance);
		if(salary >= MIN_SALARY_IN_BULGARIA){
			this.salary = salary;
		}
		else{
			throw new ClientException("Too small salary. It's a shame to work for so small ammount of money! I QUIT ");
		}		
	}

	@Override
	public void openDeposit(IBank bank, double money) throws ClientException {

		if(this.getBalance() > money){
			this.decreaseBalance(money);
			bank.increaseBalance(money);
		}
		else{
			throw new ClientException("Client can not affort to deposit so much money!");
		}
		
	}
	
	@Override
	public boolean askForACredit(double sum, byte period) throws BankException, BankProductException{
		float newPayment;		
		if(period != 0){
			newPayment = (float) (sum/period);
		}
		else{
			throw new BankException("Cannot lend a credit for a 0 period!");
		}
		
		double sumOfPayments = 0;
		for (Credit credit : credits) {
			sumOfPayments += credit.getPayment();	
		}
		
		if((newPayment + sumOfPayments) > this.salary/2){
			credits.add(new Credit(sum, period));
			return true;
		}
		
		return false;
	 }
	
	@Override
	public void printClientInfo(){
		System.out.println(super.toString() + " " + this.salary);
		for (Credit credit : credits) {
			System.out.println(credit);
		}
		
		for (Deposit deposit : deposits) {
			System.out.println(deposit);
		}
		
	}

}