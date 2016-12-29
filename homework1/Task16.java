import java.util.Scanner;

public class Task16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		short abc = sc.nextShort();
		
		if((abc % 10) == (abc/10%10) && (abc % 10) == (abc/100)){
			System.out.println("The digits are equal! ");
		}
		
		else if((abc % 10) < (abc/10%10) && (abc % 10) < (abc/100)){
			System.out.println("The digits are in descending way! ");
		}
		
		else if((abc % 10) > (abc/10%10) && (abc % 10) > (abc/100)){
			System.out.println("The digits are in an ascending way! ");
		}
		
		else{
			System.out.println("The digits are not ordered regularly! ");
		}
		
	}
}
