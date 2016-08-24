import java.util.Scanner;

public class Task11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		int space = n - 1;
		int count = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(' ');
			}
			
			for (int j = 1; j <= count; j++) {

				System.out.print('*');
			}
			
			System.out.println();
			count += 2;
			space--;
		}
	}
}
