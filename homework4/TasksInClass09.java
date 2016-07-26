import java.util.Scanner;

public class TasksInClass09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size for rows and columns: ");
		
		int rowsSize = sc.nextInt();
		int colsSize = sc.nextInt();
		
		int[][] matrix = new int[rowsSize][colsSize];

		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}

		int curSum = 0, maxSum = Integer.MIN_VALUE;
		int rowIndex = -1, colIndex = -1;
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {
				
				curSum = matrix[row][col] + matrix[row][col + 1] + 
						matrix[row + 1][col] + matrix[row + 1][col + 1];
				
				if(curSum > maxSum){
					maxSum = curSum;
					rowIndex = row;
					colIndex = col;
				}
			}
		}
		
		if(rowIndex != - 1 || colIndex != - 1){
			System.out.println("Highest 2x2 matrix sum: " + maxSum);
			System.out.println(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex + 1]);
			System.out.println(matrix[rowIndex + 1][colIndex] + " " + matrix[rowIndex + 1][colIndex + 1]);
		}
		else{
			System.out.println("You seem to have entered an invalid matrix! ");
		}
		
	}
	
}
