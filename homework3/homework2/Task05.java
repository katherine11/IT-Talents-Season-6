import java.util.Scanner;

public class Task05 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		int min = (a < b) ? a : b;
		int max = (a > b) ? a : b;
 		
		for (int i = min; i <= max ; i++) {	
			System.out.println(i);
		}
	}
}
