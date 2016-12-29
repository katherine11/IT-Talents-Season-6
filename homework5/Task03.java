import java.util.Scanner;

public class Task03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word: ");
		String word1 = sc.next();

		System.out.println("Enter the second word: ");
		String word2 = sc.next();

		int minLength = word1.length();

		if (word1.length() > word2.length()) {
			System.out.println("The length of the first string is MORE than the length of the second!");
			minLength = word2.length();
		} else {
			if (word1.length() < word2.length()) {
				System.out.println("The length of the first string is LESS than the length of the second!");
				minLength = word1.length();
			} else {
				System.out.println("The strings have EQUAL lengths!");
			}
		}

		System.out.println("Difference in indexes: ");

		for (int index = 0; index < minLength; index++) {

			if (word1.charAt(index) != word2.charAt(index)) {
				System.out.println((index + 1) + " " + word1.charAt(index) + " - " + word2.charAt(index));
			}
			else{
				System.out.println("No difference in indexes! ");
			}

		}

	}

}
