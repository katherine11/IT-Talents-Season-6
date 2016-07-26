import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// fibonachi type:

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int number = sc.nextInt();

		int[] arr = new int[10];

		arr[0] = number;
		arr[1] = number;

		for (int index = 2; index < arr.length; index++) {

			arr[index] = arr[index - 1] + arr[index - 2];

		}

		for (int index = 0; index < arr.length; index++) {

			System.out.print(arr[index] + " ");

		}

	}

}
