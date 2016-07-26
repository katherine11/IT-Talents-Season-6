import java.util.Scanner;

public class Task02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the matrix: ");

		int size = sc.nextInt();

		int[][] matrix = new int[size][size];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();

			}
		}

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				if (row == col) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}

		System.out.println();
		
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				int sum = row + col;
				if (sum == 3) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}

	}

}
