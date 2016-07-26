import java.util.Scanner;

public class Task16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short n, m;

		do {

			System.out.print("Enter n: ");
			n = sc.nextShort();
			System.out.print("Enter m: ");
			m = sc.nextShort();

		} while (n < 10 || n > 5555 || m < 10 || m > 5555);

		short min = (n < m) ? n : m;
		short max = (n > m) ? n : m;

		System.out.println("Result: ");
		
		for (short i = max; i > min; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
			}
		}
	}
}
