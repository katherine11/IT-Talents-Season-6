import java.util.Scanner;

public class Task01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter a: ");

		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		System.out.println("Enter b: ");
		float b = sc.nextFloat();
		System.out.println("Enter c: ");
		float c = sc.nextFloat();

		if (c > a && c < b) {
			System.out.println("C is between a and b");
		} else {
			System.out.println("C is NOT between a and b");
		}
	}
}
