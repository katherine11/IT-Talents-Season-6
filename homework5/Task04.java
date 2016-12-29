import java.util.Scanner;

public class Task04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter second name: ");
		String secondName = sc.nextLine();

		System.out.println("Sum of ASCII codes is more in: ");
		int sumFirst = 0, sumSecond = 0;

		for (int index = 0; index < firstName.length(); index++) {
			sumFirst += firstName.charAt(index);
		}

		for (int index = 0; index < secondName.length(); index++) {
			sumSecond += secondName.charAt(index);
		}

		if (sumFirst > sumSecond) {
			System.out.println(firstName);
		} else {
			if (sumFirst < sumSecond) {
				System.out.println(secondName);
			} else {
				System.out.println("Equal names! ");
			}
		}
	}

}
