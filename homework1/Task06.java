import java.util.Scanner;

public class Task06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a1 = sc.nextInt();
		System.out.println("Enter b: ");
		int a2 = sc.nextInt();
		System.out.println("Enter c: ");
		int a3 = sc.nextInt();

		a1 = a2;
		a2 = a3;
		a3 = a1;
		
	}
}
