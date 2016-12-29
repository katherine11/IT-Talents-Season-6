import java.util.Scanner;

public class Task07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}

		int[] newarr = new int[size];
		newarr[0] = arr[0];
		newarr[newarr.length - 1] = arr[newarr.length - 1];

		for (int index = 1; index < newarr.length - 1; index++) {

			newarr[index] = arr[index - 1] + arr[index + 1];

		}

		for (int index = 0; index < newarr.length; index++) {

			System.out.print(newarr[index] + " ");

		}

	}

}
