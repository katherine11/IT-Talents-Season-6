import java.util.Scanner;

public class Task07 {

	@SuppressWarnings("resource")	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int size = 3;

		int[][] matrix = new int[size][size];

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix.length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}

		int sumRow = 0, totalSum = 0, row = 0, col = 0;

		while(row < matrix.length - 1 || col < matrix[row].length - 1){
			int sum = row + col;
			if(col == matrix[row].length - 1){
				
				if(sum % 2 == 0){
					System.out.println(matrix[row][col] + " ");
					sumRow += matrix[row][col];
				}
				
				System.out.println();
				System.out.println("Sum of elements on the row: " + sumRow);
				totalSum += sumRow;
				sumRow = 0;
				row++;
				col = 0;
				sum = row + col;
				System.out.println();
			}
			
			if(sum % 2 == 0){
				
				System.out.print(matrix[row][col] + " ");
				sumRow += matrix[row][col];
			}
			col++;			
		}
		
		System.out.println("Total sum of elements: " + totalSum);
		
	}

}
