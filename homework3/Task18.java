import java.util.Scanner;

public class Task18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first array size: ");

		int size1 = sc.nextInt();

		int[] arr1 = new int[size1];

		for (int index = 0; index < arr1.length; index++) {

			System.out.print("arr1[" + index + "]= ");
			arr1[index] = sc.nextInt();
		}

		System.out.print("Enter second array size: ");

		int size2 = sc.nextInt();

		int[] arr2 = new int[size2];

		for (int index = 0; index < arr2.length; index++) {

			System.out.print("arr2[" + index + "]= ");
			arr2[index] = sc.nextInt();
		}

		if (size1 == size2) {

			int[] resultarr = new int[size1];

			for (int index = 0; index < size1; index++) {

				if (arr1[index] > arr2[index]) {
					resultarr[index] = arr1[index];
				} else {
					resultarr[index] = arr2[index];
				}
			}

			for (int index = 0; index < resultarr.length; index++) {

				System.out.print(resultarr[index] + " ");
			}
		}
	}
}
