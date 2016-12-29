
import java.util.Scanner;

public class TasksInClass07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n and m: ");

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int rows = 0; rows < arr.length; rows++) {

			for (int cols = 0; cols < arr[rows].length; cols++) {

				System.out.print("arr[" + rows + "][" + cols + "]= ");
				arr[rows][cols] = sc.nextInt();

			}
			System.out.println();

		}
		
		long product = 1;
		
		for (int rows = 0; rows < arr.length; rows++) {

			for (int cols = 0; cols < arr[rows].length; cols++) {

				if(rows > cols){
					
					product *= arr[rows][cols];
				}
				
			}
			
		}
		
		System.out.println("Product: " + product);
		
	}

}
