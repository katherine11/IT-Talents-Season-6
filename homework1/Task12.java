import java.util.Scanner;

public class Task12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Day: ");
		byte day = sc.nextByte();
		System.out.println("Month: ");
		byte month = sc.nextByte();
		System.out.println("Year: ");
		short year = sc.nextShort();
		
		boolean isLeap = true;
		
		if(day < 1 || day > 31){
			System.out.println("Incorrect day! ");
		}
		
		if(month < 1 || month > 12){
			System.out.println("Incorrect month!");
		}
		
		if(year < 1 && year > 3000){
			System.out.println("Incorrect year!");
		}
		else{
				if(year % 4 == 0 && year % 400 != 0){
					isLeap = true;
				}
				else isLeap = false;		
		}
		
		switch(month){
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
		
				if(day == 31){
					System.out.println("Next day: 01." + (++month) + "." + year);
				}
				
				else {
					System.out.println("Next day: " + (++day) + "." + month + "." + year);
				}
				
				break;
			
			case 2:
			
				if(isLeap && day == 28){
					System.out.println("Next day: 29.02." + year);
				}
				else{
					System.out.println("Next day: 01.03." + year);
				}
				
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				
				if(day == 30){
					System.out.println("Next day: 01." + (++month) + "." + year);
				}
				else{
					if(day == 31){
						System.out.println("Incorrect day!");
					}
					else System.out.println("Next day: " + (++day) + "." + month + "." + year);
				}
			
				break;
				
			case 12:
				if(day == 31){
					System.out.println("Happy new year " + (++year) + "! ");
					System.out.println("Next day: 01.01." + year);
				}
				
				else{
					System.out.println("Next day: " + (++day) + "." + month + "." + year);
				}
				
				break;
				
			default:
				System.out.println("Error! ");
				break;
		}
	}
}
