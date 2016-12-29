import java.util.Scanner;

public class Task25 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int fact = 1, i = 1;
		
		do {
			
			fact *= i;
			i++;
			
		}while(i <= n);
		
		System.out.println("Fact: " + fact);
		
	}

}
