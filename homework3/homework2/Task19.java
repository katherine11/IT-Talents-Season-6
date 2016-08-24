import java.util.Scanner;

public class Task19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte n;

		do {

			System.out.println("Enter a number between 10 and 99: ");
			n = sc.nextByte();

		} while (n < 10 || n > 99);

		System.out.print("Result: ");
		
		byte previous = n;
		byte next = 0;
		
		while(previous > 1){
			
			if(previous % 2 == 0){
				
				next = (byte) (0.5*previous);
			}
			else{
				
				next = (byte) (3*previous + 1);
			}
			
			System.out.print(next + " ");
			
			previous = next;
		}
		
	}
}
