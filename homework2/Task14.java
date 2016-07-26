import java.util.Scanner;

public class Task14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		short n;

		do {

			System.out.print("Enter n: ");
			n = sc.nextShort();
			
		} while (n < 10 || n > 200);
		
		for (; n > 0; n--) {

			if (n % 7 == 0)
				System.out.println(n);
		}

	}

}
