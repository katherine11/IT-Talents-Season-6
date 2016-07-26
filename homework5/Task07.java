import java.util.Scanner;

public class Task07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");
		System.out.println("Number of words: " + words.length);

		String longestWord = words[0];
		for (int index = 1; index < words.length; index++) {
			
			if(words[index].length() > longestWord.length()){
				longestWord = words[index];				
			}			
		}
		
		System.out.println("Longest word has " + longestWord.length() + " symbols!");
		
		
		
	}
}
