import java.util.Scanner;

public class Task06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		String []words = sentence.split(" ");
		
		for (int index = 0; index < words.length; index++) {

			words[index] = words[index].substring(0,1).toUpperCase() + words[index].substring(1);		
		}
		
		for (int index = 0; index < words.length; index++) {
			
			System.out.print(words[index] + " ");
			
		}
		
	}

}
