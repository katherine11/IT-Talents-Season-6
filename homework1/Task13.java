import java.util.Scanner;

public class Task13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte temperature = sc.nextByte();
		
		if(temperature < -20){
			System.out.println("Freezingly cold! ");
		}
		
		if(temperature > - 20 && temperature < 0){
			System.out.println("Cold! ");
		}
		
		if(temperature > 0 && temperature < 15){
			System.out.println("Cool! ");
		}
		
		if(temperature > 15 && temperature < 25){
			System.out.println("Warm! ");
		}
		
		if(temperature > 25){
			System.out.println("Hot! ");
		}
	}
	
}
