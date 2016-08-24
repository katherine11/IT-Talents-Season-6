import java.util.Scanner;

public class Task08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int current = n - 1, size = n;

		for (int i = 0; i < size; i++) {

			if (n == 0) {
				
				System.out.println(0);
			
			} else {
				
				for (int j = 0; j < size; j++) {

					System.out.print(current);
				}
				System.out.println();
			}
			
			n--;
			current += 2;
			
		}
	}
}
