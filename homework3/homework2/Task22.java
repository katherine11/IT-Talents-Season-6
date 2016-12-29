import java.util.Scanner;

public class Task22 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		short n;

		do {

			System.out.print("Enter n: ");
			n = sc.nextShort();

		} while (n < 1 || n > 999);

		byte countN = 0;
		short i = (short)(n + 1);

		while (countN < 10) {

			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				++countN;
				System.out.println(countN + " : " + i);
			}
			
			i++;
		}
	}
}
