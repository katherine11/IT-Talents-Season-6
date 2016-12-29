import java.util.Scanner;

public class Task15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 0 to 24: ");
		byte hour = sc.nextByte();
	
		if(hour > 24 || hour < 0){
			System.out.println("Invalid number! ");
		}
		else{
			
			switch(hour){
				
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("Good morning! ");
			break;
				
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
					
					System.out.println("Good afternoon! ");
			break;
			
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 1:
				case 2:
				case 3:
					
					System.out.println("Good evening! ");
			break;
			
			default: System.out.println("Incorrectly entered hour! ");
				
			}
			
		}
	}
}
