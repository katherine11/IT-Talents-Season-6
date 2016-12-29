import java.util.Scanner;

public class Task10 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//we will use the formula for volume of cylinder:
		System.out.println("Enter volume: ");
		
		short volume = sc.nextShort();
		
		byte a = 2;
		byte b = 3;
		
		if(volume < 10 && volume > 9999){
			System.out.println("This volume is out of the boundaries! ");
		}
		else{
			
			short module = (short)(volume % (a + b));
			short resultOfDivision = (short)(volume / (a + b));
			
			if(module == 0){
				System.out.println("For this volume you'll need " + resultOfDivision + " 2-litre buckets and " + resultOfDivision  + " 3-litre buckets. " );
			}
			
			else if(module == 2){
				System.out.println("For this volume you'll need " + resultOfDivision + " 2-litre buckets and " + resultOfDivision  + " 3-litre buckets plus one more 2-litre bucket. " );
			}
			
			else if(module == 3){
				System.out.println("For this volume you'll need " + resultOfDivision + " 2-litre buckets and " + resultOfDivision  + " 3-litre buckets plus one more 3-litre bucket. " );
			}
			
			else if(module == 4){
				System.out.println("For this volume you'll need " + resultOfDivision + " 2-litre buckets and " + resultOfDivision  + " 3-litre buckets plus two more 2-litre buckets. " );
			}
			
			else{
				System.out.println("For this volume you'll need " + (--resultOfDivision) + " 2-litre buckets and " + (++resultOfDivision)  + " 3-litre buckets plus one more 3-litre bucket. " );
			}
		}
		
		
	}
}
