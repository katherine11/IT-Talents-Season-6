import java.util.Scanner;

public class Task01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;

		do {

			System.out.print("Enter size: ");
			size = sc.nextInt();

		} while (size < 0);

		int[] arr = new int[size];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}

		int min = 0;

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] % 3 == 0) {

				if (arr[index] < min) {
					min = arr[index];
				}
			} 

		}

		for (int index = 0; index < arr.length; index++) {

			System.out.print(arr[index] + " ");
		}

		System.out.println();

		if (min != 0) {
			System.out.println("Smallest digit that is divided by 3: " + min);
		}
		else {

			System.out.println("Neither of the numbers is divided by 3! ");
		}

	}

}
