package Homework1;

public class Computer {


	int year;
	//price in euros:
	double price;
	boolean isNotebook;
	//memory in GB:
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	
	public Computer(){
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory){
		
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
				
	}
	
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer c){
		
		if(price < 0 || c.price < 0){
			System.out.println("One of the prices is not valid! ");
			return -2;
		}
		
		if(this.price == c.price){
			return 0;
		}
		
		if(this.price > c.price){
			return -1;
		}
		
		else{
			return 1;
		}
	}
	
	
	
	
	
	
	public void changeOperationSystem(String newOperationSystem) {

		if (newOperationSystem != null && !newOperationSystem.equals("")) {
			operationSystem = newOperationSystem;
		}

	}

	public void useMemory(int memory) {

		if (memory < 0) {
			System.out.println("Invalid value of the argument! ");
		}

		
		if(memory > freeMemory){
			System.out.println("There is not enough free space!");
			freeMemory = 0;				
		}
		else{
			freeMemory -= memory;
		}

	}

}

	
