package bank.abstraction;

import bank.exceptions.BankException;
import bank.exceptions.BankProductException;
import bank.exceptions.ClientException;

public interface IClient extends Changeable {

	boolean askForACredit(double sum, byte period) throws BankException, BankProductException;
	void printClientInfo();
	void openDeposit(IBank bank, double money) throws ClientException;
	
	
}
