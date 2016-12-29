import java.util.Scanner;

public class Task13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte n;
		
		do{
			System.out.println("Enter a number: ");
			n = sc.nextByte();
		}
		while(n < 2 || n > 27);
		
		short firstD, secondD, thirdD;
		
		for (short i = 100; i < 999; i++) {
		
			firstD = (byte)(i % 10);
			secondD = (byte)((i / 10) % 10);
			thirdD = (byte)(i / 100);
			
			if((firstD + secondD + thirdD) == n)
				System.out.println(i);
			
		}
	}

}
