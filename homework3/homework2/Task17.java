import java.util.Scanner;

public class Task17 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte b;
		char symbol;

		do {

			System.out.println("Enter a number between 3 and 20: ");
			b = sc.nextByte();
			System.out.println("Enter a symbol: ");
			symbol = sc.next().charAt(0);
		} while (b < 3 || b > 20);

		
		for (int i = 0; i < b; i++) {

			for (int j = 0; j < b; j++) {

				if (j == (b - 1)) {

					System.out.print('*');
					System.out.println();

				} else {
					if (i == 0 || j == 0 || i == (b - 1)) {

						System.out.print('*');

					}

					else {
						System.out.print(symbol);
					}
				}
			}
		}
	}
}
