import java.util.Scanner;

public class Task09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = str.replaceAll("[^-?0-9]+", " ");

		int sum = 0;
		for (int index = 1; index < str.length(); index++) {

			System.out.println(str.charAt(index));
			sum += (int) str.charAt(index);

		}

		System.out.println("Sum: " + sum);

	}

}
