package bank.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import bank.abstraction.ContactInfo;

public class Demo {

	public static void main(String[] args){

		try {
			Deposit longDeposit = new Deposit("Long Deposit", (byte) 12, (float) 0.05);
			Deposit shortDeposit = new Deposit("Short Deposit", (byte) 3, (float) 0.03);

			Credit homeCredit = new Credit("Home Credit", 0.06);;
			Credit consumerCredit = new Credit("Consumer Credit", 0.1);

			Bank pireusBank = new Bank("Pireus Bank", "Plovdiv, Rakovska Street 66", 1_000_000);
			pireusBank.addBankProduct(longDeposit);
			pireusBank.addBankProduct(shortDeposit);
			pireusBank.addBankProduct(homeCredit);
			pireusBank.addBankProduct(consumerCredit);

			List<Client> clients = new ArrayList<Client>();

			final String[] names = { "Gosho", "Pesho", "Misho", "Gergina", "Tina", "Mina" };

			for (int index = 0; index < clients.size(); index++) {
				clients.add(new Client(names[new Random().nextInt(names.length)], (Math.random() * 5600 + 1000),
						(float) (Math.random() * 9000 + 5000)));
			}

			for (Client client : clients) {

				double money = ((Math.random() * 21.0) / 150.0) * ((ContactInfo) client).getBalance();
				client.openDeposit(pireusBank, money);
			}

			for (Client client : clients) {
				
				pireusBank.lendCredit(client, (Math.random() * 1000.0) + 5.0, (byte) ((int)(Math.random() * 60)+1));
				
			}
			
			System.out.println("Available sum of bank's money: " + pireusBank.getBalance());
			System.out.println("Bank's reserve: " + pireusBank.getReserve());

			// until here it's okay!

			System.out.println("Clients' info: ");
			for (Client client : clients) {
				client.printClientInfo();
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
