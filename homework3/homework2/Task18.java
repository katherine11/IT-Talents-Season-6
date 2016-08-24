import java.util.Scanner;

public class Task18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte x, y;

		do {

			System.out.print("Enter x: ");
			x = sc.nextByte();
			System.out.print("Enter y: ");
			y = sc.nextByte();

		} while (x < 1 || y < 1 || x > 9 || y > 9);

		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= y; j++) {
					System.out.println(i + "*" + j + " = " + i*j);
			}
		}

	}
}
