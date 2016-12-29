
public class Computer {

	int year;
	//price in euros:
	double price;
	boolean isNotebook;
	//memory in GB:
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

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
