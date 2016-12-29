
import java.util.Scanner;

public class Task15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");

		int size = sc.nextInt();

		double[] realarr = new double[size];

		for (int index = 0; index < realarr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			realarr[index] = sc.nextDouble();
		}
		
		double max1 = 0, max2 = 0, max3 = 0;
		byte maxIndex1 = 0, maxIndex2 = 0;

		for (int index = 0; index < realarr.length; index++) {

			if (Math.abs(realarr[index]) > Math.abs(max1)) {
				max1 = realarr[index];
				maxIndex1 = (byte) index;
			}
		}

		for (int index = 0; index < realarr.length; index++) {

			if (index != maxIndex1) {

				if (Math.abs(realarr[index]) > Math.abs(max2)) {
					max2 = realarr[index];
					maxIndex2 = (byte) index;
				}
			}
		}

		for (int index = 0; index < realarr.length; index++) {

			if (index != maxIndex1 && index != maxIndex2) {

				if (Math.abs(realarr[index]) > Math.abs(max3)) {
					max3 = realarr[index];
				}
			}
		}

		System.out.println("Elements with max sum: " + max1 + " " + max2 + " " + max3);

	}
}
