import java.util.Scanner;

public class Task09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		byte a = sc.nextByte();
		System.out.println("Enter b: ");
		byte b = sc.nextByte();
		
		int product = a*b;
		if(product % 10 == 0){
			System.out.println(product + " , " + (product % 10) + " - Even number! ");
		}
		else{
			System.out.println(product + " , " + (product % 10) + " - Odd number! ");
		}
	}
}
