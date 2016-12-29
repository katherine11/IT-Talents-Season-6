import java.util.Scanner;

public class TasksInClass11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and cols size of the matrix: ");

		int n = sc.nextInt();
		int m = sc.nextInt();

		int [][] matrix = new int[n][m];
		
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print("matrix[" + row + "][" + col + "]= ");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		//first way:
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {
				
				System.out.print(matrix[row][col] + " ");
			}
			
			System.out.println();
		}
		
		//second way:
	
		for (int col = 0; col < matrix.length; col++) {
			
			for (int row = 0; col < matrix[col].length - 1; row++) {
				
				System.out.print(matrix[row][col] + " ");
			}
			
			System.out.println();
		}
		
		
		for (int col = 0; col < matrix.length; col++) {
			
			for (int row = matrix[col].length - 1; row >= 0; row--) {
				
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		//third way:
	
		int number = 0;
		for (int row = 0; row < matrix.length; row++) {
		
			for (int col = row + 1; col < matrix[row].length; col++) {
				int sum = row + col;
				if(sum == number){
					System.out.println(matrix[row][col]);
				}
				number++;
			}
		}

		
		//forth way:
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length - 1; col++) {
				
				System.out.print(matrix[col][row] + " ");
			}
			
			System.out.println();
		}
		
	}

}
