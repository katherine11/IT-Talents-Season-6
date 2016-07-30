package bank.abstraction;
import bank.exceptions.ContactInfoException;

public abstract class ContactInfo extends ValidationClass{

	private String name;
	private String address;
	private double balance;
	
	
	public ContactInfo(String name, double balance) throws ContactInfoException{
		if(isValidString(name)){
			this.name = name;
		}
		else{
			throw new ContactInfoException("This name is not valid! Please try agin with another one! ");
		}
		
		this.balance = balance;
	
	}
	
	public ContactInfo(String name, String address, double balance) throws ContactInfoException {
		
		this(name, balance);
		
		if(isValidString(address)){
			this.address = address;
		}
		else{
			throw new ContactInfoException("Address not valid! Please try again using another one! ");
		}	
	}	

	public double getBalance() {
		return this.balance;
	}
	
	public void increaseBalance(double balance){
		if(balance > 0){
			this.balance += balance; 
		}
	}
	
	public void decreaseBalance(double balance){
		if(balance > 0){
			this.balance -= balance;
		}
	}

	@Override
	public String toString() {
		return this.name + " " + this.address + " " + this.balance;
	}

	
	
}
