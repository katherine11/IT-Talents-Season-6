
import java.util.Scanner;

public class TasksInClass01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n and m: ");

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int rows = 0; rows < arr.length; rows++) {

			for (int cols = 0; cols < arr[rows].length; cols++) {

				System.out.println("arr[" + rows + "][" + cols + "]= ");
				arr[rows][cols] = sc.nextInt();

			}

		}

		boolean isPositive = true;

		for (int rows = 0; rows < arr.length; rows++) {

			for (int cols = 0; cols < arr[rows].length; cols++) {

				if (arr[rows][cols] < 0) {
					isPositive = false;
					break;
				}
			}
			
			if(!isPositive){
				break;
			}

		}
		
		if(isPositive){
			
			System.out.println("All the elements are positive! ");
		}
		else{
			
			System.out.println("NOT all the elements are positive! ");
		}

	}

}

