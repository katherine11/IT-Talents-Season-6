import java.util.Scanner;

public class Task06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int size = 6;

		int[][] matrix = new int[size][size];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix.length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
			System.out.println();
		}	
		
		int sumRow = 0, totalSum = 0;

		for (int row = 1; row < matrix.length; row += 2) {

			for (int col = 0; col < matrix.length; col++) {

				System.out.print(matrix[row][col] + " ");
				sumRow += matrix[row][col];

			}
			System.out.println("Sum row: " + sumRow);
			totalSum += sumRow;
			sumRow = 0;
		}
		
		System.out.println("Total sum of elements: " + totalSum);

	}

}
