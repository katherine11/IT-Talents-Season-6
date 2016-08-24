import java.util.Scanner;

public class Task09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		byte a = sc.nextByte();
		System.out.print("Enter b: ");
		byte b = sc.nextByte();

		short sum = 0;

		for (; a <= b && sum <= 200; a++) {

			if (a % 3 == 0) {
				System.out.print("Skip " + a + ", ");
			}

			else {
				System.out.print(a * a + ", ");
				sum += a * a;
			}
		}
		
		if(sum > 200){
			System.out.println("The sum is already more than 200 !");
		}
		
		if(a > b){
			System.out.println("End of the interval! ");
		}
	}
}
