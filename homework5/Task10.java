
public class Task10 {

	public static void main(String[] args) {

		String word = "Hello";

		for (int index = 0; index < word.length(); index++) {

			char resultletter = (char) (word.charAt(index) + 5);

			System.out.print(resultletter);

		}

		System.out.println();

	}

}
