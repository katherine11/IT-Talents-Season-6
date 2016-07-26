import java.util.Scanner;

public class Task15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0, i = 1;
		
		do{
			
			sum += i;
			i++;
		
		}while(i <= n);
		
		System.out.println("Result: " + sum);
		
	}
}
