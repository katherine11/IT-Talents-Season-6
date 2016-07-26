import java.util.Scanner;

public class Task01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[6][5];

		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}

		int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				if (matrix[row][col] < minValue) {

					minValue = matrix[row][col];
				}

				if (matrix[row][col] > maxValue) {

					maxValue = matrix[row][col];
				}
			}
		}

		System.out.println("Min value: " + minValue);
		System.out.println("Max value: " + maxValue);

	}

}
