import java.util.Scanner;

public class Task08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four-digit number: ");
		short number = sc.nextShort();
		
		if(number < 1000 && number > 9999){
			System.out.println("Out of the boundaries! ");
		}
		
		else{
			
			int first = 10*(number/1000) + (number % 10);
			int second = 10*(number/100 % 10) + (number/10%10);
			
			if(first < second){
				System.out.println("The first number is smaller than the second! ");
			}
			else{
				
				if(first > second){
					System.out.println("The first number is bigger than the second! ");
				}
				
				else{
					System.out.println("The numbers are equal! ");
				}		
			}
		}		
	}
}
