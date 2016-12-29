import java.util.Scanner;

public class Task05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = 4;

		int[][] matrix = new int[size][size];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix.length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}

		int curSumRows = 0, curSumCols = 0, maxSumRows = 0, maxSumCols = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix.length; col++) {

				curSumRows += matrix[row][col];
				curSumCols += matrix[col][row];
			}

			if (curSumRows > maxSumRows) {
				maxSumRows = curSumRows;
			}

			if (curSumCols > maxSumCols) {
				maxSumCols = curSumCols;
			}

			curSumRows = 0;
			curSumCols = 0;

		}

		System.out.println("Max sum of rows: " + maxSumRows);
		System.out.println("Max sum of columns: " + maxSumCols);

		if (maxSumCols > maxSumRows) {
			System.out.println("Max sum of columns is MORE than max sum of rows");
		} else {
			if(maxSumCols == maxSumRows){
				System.out.println("The max sums are EQUAL!");
			}
			System.out.println("Max sum of columns is LESS than max sum of rows");
		}

	}

}
