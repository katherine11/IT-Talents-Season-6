import java.util.Scanner;

public class Task16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] arr = new double[10];

		// въвежда:
		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextDouble();
		}

		// извежда:
		for (int index = 0; index < arr.length; index++) {

			System.out.print(arr[index] + " ");

		}

		System.out.println();

		// замяна на стойности:

		double[] newarr = new double[10];

		for (int index = 0; index < newarr.length; index++) {

			if (arr[index] < -0.231) {
				newarr[index] = (index + 1) * (index + 1) + 41.25;
			} else {
				newarr[index] = arr[index] * (index + 1);
			}
		}

		for (int index = 0; index < newarr.length; index++) {

			System.out.print(newarr[index] + " ");
		}

	}

}
