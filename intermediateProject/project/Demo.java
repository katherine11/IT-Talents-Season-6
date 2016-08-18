package project;


import java.util.Scanner;
import exceptions.StorageException;
import exceptions.UserException;

public class Demo {
	
	private  static Storage storage = new Storage();
	
	public static void main(String[] args) {
		try{
		choose();
		}
		catch(UserException | StorageException e){
			System.out.println(e.getMessage());
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

		case 1:
			register(storage);
			break;
			
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

	private static void searchAdvertisements() {
		// TODO Auto-generated method stub
		
	}

	private static void login() {
		// TODO Auto-generated method stub
		
	}

	private static void register(Storage storage) throws UserException {
		Scanner sc = new Scanner(System.in);

		int x;
		do{
			System.out.println("1) - Registrirane na normalen user.");
			System.out.println("2) - Registrirane na administrator.");
			x = sc.nextInt();
		}
		while(!(x == 1 || x == 2));
		
		
		System.out.println("Register: ");
		System.out.println("Enter email address: ");
		String email = sc.nextLine();

		System.out.println("Enter password: ");
		String password = sc.nextLine();
		System.out.println("Enter full name: ");
		String fullName = sc.nextLine();
		System.out.println("Enter telephone number: ");
		String telephone = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		User user = null;
		if(x == 1){
			user = new Normaluser(email, password, fullName, telephone, address, age);
		}
		
		if(x == 2){
			user = new Administrator(email, password, fullName, telephone, address, age);
		}
		
		try {
			storage.addUser(user);
		} catch (StorageException e) {
			e.printStackTrace();
		}
		
		System.out.println("The registration was successful! ");
		
		System.out.println("Please enter: ");
		System.out.println("1 - for menu \n 2 - for exit");
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1:
			try {
				choose();
			} catch (UserException | StorageException e) {
				e.printStackTrace();
			}

		case 2: 
			System.out.println("Bye bye");
			System.exit(0);
			
		}
		
		sc.close();		
		
	}
	
	

}
