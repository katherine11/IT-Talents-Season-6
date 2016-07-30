package bank.abstraction;

import bank.exceptions.BankException;
import bank.exceptions.BankProductException;
import bank.exceptions.ClientException;
import bank.functionality.Deposit;

public interface IBank extends Changeable {

	Deposit openDeposit(double money) throws BankException;
	void payInterests() throws ClientException;
	void lendCredit(IClient client, double sum, byte period) throws BankException, BankProductException, ClientException;
	
	
	
}
