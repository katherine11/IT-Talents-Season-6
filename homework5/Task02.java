import java.util.Scanner;

public class Task02 {

	static String longestWord(String word1, String word2) {

		return (word1.length() > word2.length()) ? word1 : word2;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words: ");

		String word1 = sc.next();
		String word2 = sc.next();

		System.out.println(longestWord(word1, word2).length() + " ");

		String newWord1 = word1.substring(0, 5);
		String newWord2 = word2.substring(0, 5);

		if (longestWord(word1, word2) == word1) {
			System.out.println(newWord2 + word1.substring(5));
			return;
		}

		if (longestWord(word1, word2) == word2) {
			System.out.println(newWord1 + word2.substring(5));
			return;
		}

	}

}
