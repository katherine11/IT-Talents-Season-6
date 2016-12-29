import java.util.Scanner;

public class Task11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		short number = sc.nextShort();
		
		if((number % 10 == 0) || (((number/10) % 10) == 0) || (number/100  == 0)){
			System.out.println("Incorrectly entered number! ");
		}
		else{
			
			boolean divides = true;
			
			if(number % (number % 10) == 0 && number % (number/10%10) == 0 && number % (number/100) == 0){
				divides = true;
			}
			
			else {
				divides = false;
			}
		
			System.out.println(divides);
		}
	}
}
