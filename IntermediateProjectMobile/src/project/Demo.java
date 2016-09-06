package project;

import java.util.Scanner;

import exceptions.StorageException;
import exceptions.UserException;

public class Demo {

	public static void main(String[] args) {
		try {
			choose();
		} catch (UserException | StorageException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void choose() throws UserException, StorageException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("- 1) Register              -");
		System.out.println("- 2) Login                 -");
		System.out.println("- 3) Search advertisements -");
		System.out.println("----------------------------");
		
		System.out.println("Enter operation: ");
		int choice = 0;
		while(true){
			choice = scanner.nextInt();
			if(choice == 0 || choice == 1 || choice == 2 || choice == 3){
				break;
			}
			else{
				System.out.println("Enter a valid option! (0 for exit): ");
			}
		}
		
		switch (choice) {
		
		case 0:
			System.out.println("Bye bye");
			System.exit(0);

//		case 1:
//			register(storage);
//			break;
			
		case 2:
			login();
			break;

		case 3:
			searchAdvertisements();
			break;
			
		default:
			scanner.close();
			break;
		}
		
		
		
		
	}

	private static void login() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = scanner.nextLine();
		System.out.println("Enter password: ");
		String password = scanner.nextLine();
		
		boolean loggedIn = false;
//		for (User user : storage.getUsers()) {
//			if(user.getUsername().equals(username)){
//				user.login(username, password);
//				loggedIn = true;
//			}
//		}
		
		if(!loggedIn){
			System.out.println("Login was not successfull! ");
		}else{
			System.out.println("Successfull login! ");
		}
		
	}

	private static void searchAdvertisements() {
		
		System.out.println("Please enter the required fields to search for advertisement: ");
		System.out.println("");
		
		
		

	}

//	private static void register(Storage storage) throws UserException {
//		
//		Scanner sc = new Scanner(System.in);
//
//		int number;
//		do {
//			System.out.println("1) - Normal user register.");
//			System.out.println("2) - Administrator register.");
//			number = sc.nextInt();
//		} while (!(number == 1 || number == 2));
//
//		register(storage, sc, number);
//
//		System.out.println("Please enter: ");
//		System.out.println("1 - for menu \n 2 - for exit");
//		int choice = sc.nextInt();
//
//		switch (choice) {
//
//		case 1:
//			try {
//				choose();
//			} catch (UserException | StorageException e) {
//				e.printStackTrace();
//			}
//
//		case 2:
//			System.out.println("Bye bye");
//			System.exit(0);
//
//		}
//
//		sc.close();
//
//	}
//
//	static void register(Storage storage, Scanner sc, int x) throws UserException {
//
//		System.out.println("Register: ");
//		System.out.println("Enter username: ");
//		String username = sc.nextLine();
//		System.out.println("Enter email address: ");
//		String email = sc.nextLine();
//		System.out.println("Enter password: ");
//		String password = sc.nextLine();
//		System.out.println("Enter full name: ");
//		String fullName = sc.nextLine();
//		System.out.println("Enter telephone number: ");
//		String telephone = sc.nextLine();
//		System.out.println("Enter address: ");
//		String address = sc.nextLine();
//		System.out.println("Enter age: ");
//		int age = sc.nextInt();
//
//		User user = null;
//		if (x == 1) {
//			user = new Normaluser(username, email, password, fullName, telephone, address, age);
//		}
//
//		if (x == 2) {
//			user = new Administrator(username, email, password, fullName, telephone, address, age);
//		}
//
//		try {
//			storage.addUser(user);
//		} catch (StorageException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("The registration was successful! ");
//	}

}
