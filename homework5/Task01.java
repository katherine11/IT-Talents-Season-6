import java.util.Scanner;

public class Task01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String string1 = "";
		do{
			System.out.println("Enter the first string: ");
			string1 = sc.nextLine();
		}
		while(string1.length() > 40);
		
		String string2 = "";
		do{
			System.out.println("Enter the second string: ");
			string2 = sc.nextLine();
		}
		while(string2.length() > 40);
				
		System.out.println(string1.toUpperCase() + " ");
		System.out.println(string1.toLowerCase() + " ");
		System.out.println(string2.toUpperCase() + " ");
		System.out.println(string2.toLowerCase() + " ");

	}

}
