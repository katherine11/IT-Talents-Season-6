

import java.util.Scanner;

public class Task14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte x1, y1, x2, y2;

		System.out.println("Enter x1 and y1: ");
		x1 = sc.nextByte();
		y1 = sc.nextByte();

		System.out.println("Enter x2 and y2: ");
		x2 = sc.nextByte();
		y2 = sc.nextByte();

		boolean equal = false;

		if (x1 < 1 || x2 < 1 || y1 < 1 || y2 < 1 || x1 > 8 || y1 > 8 || x2 > 8 || y2 > 8) {
			System.out.println("Wrong coordinates! ");
		}

		else {

			if (x1 == x2 && y1 == y2) {
				System.out.println("Equal coordinates! ");
			}

			if (x1 == y1 && x2 == y2) {
				equal = true;
			}

			else {

				if ((x1 - x2) % 2 == ((~(y1 - y2)) % 2) || (~(x1 - x2)) % 2 == ((y1 - y2) % 2)) {// ||
																									// (x1
																									// -
																									// x2)
																									// %
																									// 2
																									// ==
																									// ((y1
																									// -
																									// y2)
																									// %
																									// 2))
																									// {
					equal = false;
				}

				else {
					equal = true;
				}
			}
		}

		if (equal) {
			System.out.println("Equal colour! ");
		} else {
			System.out.println("Different colour! ");
		}
	}
}
