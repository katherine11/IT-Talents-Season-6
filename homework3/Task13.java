import java.util.Scanner;

public class Task13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number in decimal numeral system: ");

		long number = sc.nextInt();

		byte[] binary = new byte[50];

		byte index = (byte) (binary.length - 1);

		while (number > 0 || index >= 0) {

			byte lastDigit = (byte) (number % 2);
			binary[index] = lastDigit;
			number /= 2;
			index--;
		}
		
		for (int binIndex = 0; binIndex < binary.length; binIndex++) {
			
			System.out.print(binary[binIndex]);
			
		}
		
	}
}
