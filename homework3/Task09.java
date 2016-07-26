import java.util.Scanner;

public class Task09 {

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

		// с нов масив:

		int[] newarr = new int[size];
		int currInd = arr.length - 1;

		for (int i = 0; i < newarr.length; i++) {

			newarr[i] = arr[currInd];
			currInd--;
		}

		// със същия масив:

		for (int index = 0; index < arr.length; index++) {

			if (currInd > arr.length / 2) {
				int temp = arr[index];
				arr[index] = arr[currInd];
				arr[currInd] = temp;

				currInd--;

			}
		}

		for (int index = 0; index < arr.length; index++) {

			System.out.print(arr[index] + " ");

		}

	}

}
