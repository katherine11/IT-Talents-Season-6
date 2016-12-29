
import java.util.Scanner;

public class Task03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println("Current value of a: " + a);
		System.out.println("Current value of b: " + b);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("New value of a: " + a);
		System.out.println("New value of b: " + b);

	}

}
