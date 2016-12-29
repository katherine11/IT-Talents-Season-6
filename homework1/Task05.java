import java.util.Scanner;

public class Task05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		
		if (a >= b && b >= c){
			System.out.println("Result: " + a + " " + b + " " + c);
		}
		
		if(a >= c && c >= b){
			System.out.println("Result: " + a + " " + c  + " " + b);
		}
		
		if(b >= c && c >= a){
			System.out.println("Result: " + b + " " + c  + " " + a);
		}
		
		if(b >= a && a >= c){
			System.out.println("Result: " + b + " " + a  + " " + c);
		}
		
		if(c >= a && a >= b){
			System.out.println("Result: " + c + " " + a + " " + b);
		}
		
		if(c >= b && b >= a){
			System.out.println("Result: " + c + " " + b  + " " + a);
		}
	}
}
		
		
		
		
		