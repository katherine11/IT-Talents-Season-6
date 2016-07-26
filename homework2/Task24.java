import java.util.Scanner;

public class Task24 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;

		 do {

		System.out.print("Enter a number: ");
		number = sc.nextInt();

		}
		while(number < 10 || number > 30000);

		int ncopy = number, reversedN = 0;
		
		do {
		
			int remained = number % 10;
			reversedN = reversedN*10 + remained;
			number /= 10;
			
		} while (number > 0);

		if(reversedN == ncopy){
			System.out.println("Palindrome! ");
		}
		else{
			System.out.println("Not a palindrome! ");
		}
	}

}
