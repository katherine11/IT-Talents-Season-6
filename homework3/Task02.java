import java.util.Scanner;

public class Task02 {

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

		for (int index = 0; index < arr.length / 2; index++) {

			newarr[index] = arr[index];
		}

		int currentInd = arr.length / 2;
		for (int index = arr.length - 1; index >= arr.length / 2; index--) {

			newarr[currentInd] = arr[index];
			currentInd++;

		}

		for (int index = 0; index < newarr.length; index++) {

			System.out.print(newarr[index] + " ");
		}

	}

}
