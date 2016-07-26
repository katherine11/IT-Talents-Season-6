import java.util.Scanner;

public class Task04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//check!
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the rows and cols size of the matrix: ");

		int rowsSize = sc.nextInt();
		int colsSize = sc.nextInt();

		int[][] matrix = new int[rowsSize][colsSize];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for (int col = 0; col < matrix.length; col++) {
			
			for (int row = matrix[col].length - 1; row >= 0; row--) {
				
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}

}
