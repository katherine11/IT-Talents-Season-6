package bank.functionality;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import bank.abstraction.BankProduct;
import bank.abstraction.ContactInfo;
import bank.abstraction.IBank;
import bank.abstraction.IClient;
import bank.exceptions.BankException;
import bank.exceptions.BankProductException;
import bank.exceptions.ClientException;
import bank.exceptions.ContactInfoException;

public class Bank extends ContactInfo implements IBank{

	private static final double PERCENT_TO_INCREASE_RESERVE = 0.9;
	private static final int MIN_CAPITAL = 10_000;
	private List<BankProduct> products = new ArrayList<BankProduct>();
	private double reserve;
	
	public Bank(String name, String address, int beginningCapital) throws ContactInfoException, BankException {
		super(name, address, beginningCapital);
		
		if(beginningCapital < MIN_CAPITAL){
			throw new BankException("Not enough money to start! ");
		}
	}
	
	
	public void addBankProduct(BankProduct product) throws BankException{
		if(product != null){
			products.add(product);
		}
		else{
			throw new BankException("Invalid bank product given!");
		}
	}
	
	@Override
	public Deposit openDeposit(double money) throws BankException{
	
		this.increaseBalance(money);
		this.reserve = PERCENT_TO_INCREASE_RESERVE * money;
		
		BankProduct product;
		
		do{
			product = this.products.get(new Random().nextInt(products.size()));
		}
		while(!(this.products instanceof Deposit));
		
		try {
			Deposit result = (Deposit) product.clone();
			result.setBalance(money);
			return result;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new BankException("Sorry, but a deposit could not be created right now! :(");
		}
		
		
	}
	
	@Override
	public void payInterests() throws ClientException {
		
		float sum = 0;
		for (BankProduct bankProduct : products) {
			if(bankProduct instanceof Deposit){
				sum += calculateInterest((Deposit) bankProduct);
			}
		}
		
		this.decreaseBalance(sum);
		if(this.getBalance() < 0){
			try {
				throw new BankException("The bank reached its bankrupt! Cannot pay more interests!");
			} catch (BankException e) {
				e.printStackTrace();
				throw new ClientException("Sorry, there is a problem with the interest paying. Please wait a few weeks!",e);
			}
		}
	}
	
	private static double calculateInterest(Deposit deposit){
		return deposit.getPayedSum();
	}
	
	@Override
	public void lendCredit(IClient client, double sum, byte period) throws BankException, BankProductException, ClientException{
	
		if(client.askForACredit(sum, period)){
			if(sum > this.reserve){
				throw new BankException("Sorry, but the bank can not afford to give such a credit! ");
			}
			else{
				this.decreaseBalance(sum);
			}
		}
		else{
			throw new ClientException("Client's request for a credit was not accepted! Sorry...");
		}
		
	}
	
	public double getReserve() {
		return this.reserve;
	}


	
	
}
