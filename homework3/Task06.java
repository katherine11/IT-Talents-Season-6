import java.util.Scanner;

public class Task06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first array size: ");

		int size1 = sc.nextInt();

		System.out.println("Enter first array size: ");

		int size2 = sc.nextInt();

		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];

		if (arr1.length != arr2.length) {
			System.out.println("Different size! ");
		}

		else {
			
			System.out.println("First array elements: ");
			for (int index = 0; index < arr1.length; index++) {

				System.out.print("arr1[" + index + "]= ");
				arr1[index] = sc.nextInt();
			}

			System.out.println("Second array elements: ");
			for (int index = 0; index < arr2.length; index++) {

				System.out.print("arr2[" + index + "]= ");
				arr2[index] = sc.nextInt();
			}

			boolean equal = true;

			for (int index = 0; index < arr1.length; index++) {

				if (arr1[index] != arr2[index]) {

					equal = false;
					break;
				}

			}

			if (equal) {
				System.out.println("Equal content! ");
			} 
			else {
				System.out.println("Different content! ");
			}
		}
	}
}
