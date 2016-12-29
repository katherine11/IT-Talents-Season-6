import java.util.Scanner;

public class Task02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a: ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		int substract = a - b;
		int product = a * b;
		int divison = a / b;
		int modulus = a % b;
		
		System.out.println("Sum: " + sum);
		System.out.println("Substracr: " + substract);
		System.out.println("Product: " + product);
		System.out.println("Division: " + divison);
		System.out.println("Modulus: " + modulus);
		
		
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter c: ");
		double c = dc.nextDouble();
		System.out.println("Enter d: ");
		double d = dc.nextDouble();
		
		double sumD = c + d;
		double substractD = c - d;
		double productD = c * d;
		double divisonD = c / d;
		double modulusD = c % d;
		
		System.out.println("Sum: " + sumD);
		System.out.println("Substract: " + substractD);
		System.out.println("Product: " + productD);
		System.out.println("Division: " + divisonD);
		System.out.println("Modulus: " + modulusD);
		
	}
}
		

		