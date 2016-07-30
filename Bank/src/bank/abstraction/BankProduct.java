package bank.abstraction;

import bank.exceptions.BankProductException;

public abstract class BankProduct extends ValidationClass{

	private static final int MAX_PERIOD_FOR_USING_BANK_PRODUCT = 60;
	private String name;
	// >0 && <= 1.0 because it's a per cent!
	protected float interest;
	// period from 1 to 60 months;
	protected byte period;
	protected double money;

	public BankProduct(String name, byte period, float interest) throws BankProductException {
		this(name);
		if(period > 0 && period <= MAX_PERIOD_FOR_USING_BANK_PRODUCT){
			this.period = period;
		}
		else{
			throw new BankProductException("The period must be between 1 and 60 months! Please try again enetering the period! ");
		}
		
		if(interest > 0 && interest < 1){
			this.interest = interest;
		}
		else{
			throw new BankProductException("The interest is a number between 0 and 1! Please try again! ");
		}
	}

	public BankProduct(String name, double money) throws BankProductException {
		if(isValidString(name)){
			this.name = name;
		}
		else{
			throw new BankProductException("Invalid name given!");
		}
	}

	private BankProduct(String name){
		if(isValidString(name)){
			this.name = name;
		}
	}

	public BankProduct(double money) {
		if(money > 0){
			this.money = money;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return this.name + " " + this.interest + " "  + this.period + " " + this.money;
	}
	
	

}
