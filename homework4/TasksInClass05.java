
import java.util.Scanner;

public class TasksInClass05{

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

		int sum = 0, maxSum = Integer.MIN_VALUE, ind = 0;

		for (int rows = 0; rows < arr.length; rows++) {

			for (int cols = 0; cols < arr[rows].length; cols++) {

				sum += arr[rows][cols];

			}

			if (sum > maxSum) {
				maxSum = sum;
				ind = rows;
			}

			sum = 0;
		}
		
		System.out.println("Row with max sum: " + ind);

	}

}
