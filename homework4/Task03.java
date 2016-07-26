import java.util.Scanner;

public class Task03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and cols size of the matrix: ");

		int rowsSize = sc.nextInt();
		int colsSize = sc.nextInt();

		int[][] matrix = new int[rowsSize][colsSize];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}

		int sumrow = 0, sumAllRows = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				sumrow += matrix[row][col];
			}
			sumAllRows += sumrow;
			sumrow = 0;
		}

		int allElements = matrix.length*matrix[0].length;
		
		double average = (double) (sumAllRows / allElements);

		System.out.println("Sum of elements: " + sumAllRows);
		System.out.println("Average value: " + average);

	}

}
