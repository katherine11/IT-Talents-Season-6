import java.util.Scanner;

public class Task10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}

		int sum = 0;

		for (int index = 0; index < arr.length; index++) {

			sum += arr[index];
		}

		double averageValue = (double) (sum / arr.length);
		double currentDiff = 0;
		double closestValue = 0;

		for (int index = 0; index < arr.length; index++) {

			double closestValueDiff = closestValue - averageValue;
			currentDiff = arr[index] - averageValue;

			// за да вземе абсолютната стойност на числaтa:
			currentDiff = (currentDiff < 0) ? -currentDiff : currentDiff;
			closestValueDiff = (closestValueDiff < 0) ? -closestValueDiff : closestValueDiff;

			if (currentDiff < closestValueDiff) {
				closestValue = arr[index];
			}

		}

		System.out.println("Average value: " + averageValue);
		System.out.println("Closest to average value: " + closestValue);

	}

}
