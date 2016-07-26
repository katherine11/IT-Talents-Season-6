package Homework1;

public class ComputerDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Computer samsung = new Computer();
		Computer lenovo = new Computer(2012,1000,700,300);
		Computer hp = new Computer(2015, 3000,true,10000,5000,"Mac OS");
		
		System.out.println("Let's compare the prices of lenovo and HP.The result is:  ");
		
		switch(lenovo.comparePrice(hp)){
		
		case 0: System.out.println("The prices are equal! ");
			break;
		case 1: System.out.println("HP is more expensive than Lenovo!");
			break;
		case -1: System.out.println("Lenovo is more expensive than HP! ");
			break;
			
		default: System.out.println("One of the prices is not valid. ");
			break;
		
		
		}
	}

}
