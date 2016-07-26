import java.util.Scanner;

public class Task08 {

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

		byte currentCount = 1, maxCount = 1;
		int element = arr[0];

		for (int index = 0; index < arr.length - 1; index++) {

			if (arr[index] == arr[index + 1]) {
				currentCount++;
				if (currentCount > maxCount) {
					maxCount = currentCount;
					element = arr[index];
				}
			} 
			
			else {
				currentCount = 1;
			}

		}

		System.out.println("Max sequence of numbers: ");

		for (; maxCount > 0; maxCount--) {
			System.out.print(element + " ");

		}
	}
}
