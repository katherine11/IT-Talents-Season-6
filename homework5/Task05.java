import java.util.Scanner;

public class Task05 {
	
	static void printCrossWords(String word1, String word2, char character) {

		for (int index = 0; index < word1.length(); index++) {

			if (word1.charAt(index) == character) {
				int tempIndex = index;
				System.out.println(word1.substring(0, tempIndex) + word2);
			} else {
				System.out.println(word1.charAt(index) + " ");
			}

		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String firstWord = sc.nextLine();
		System.out.println("Enter second word: ");
		String secondWord = sc.nextLine();
		
		if(firstWord.equalsIgnoreCase(secondWord)){
			System.out.println("The words are equal! ");
		}

		boolean haveCommonChar = false;
		int maxLength = (firstWord.length() > secondWord.length()) ? firstWord.length() : secondWord.length();
		for (int index = 0; index < maxLength; index++) {

			if (firstWord.charAt(index) == secondWord.charAt(index)) {
				haveCommonChar = true;
				char commonCh = firstWord.charAt(index);
				printCrossWords(firstWord, secondWord, commonCh);
			}
		}
		
		if(!haveCommonChar){
			System.out.println("The words have NOT common characters! ");
		}
		
	}
}
