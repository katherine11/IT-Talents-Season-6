import java.util.Scanner;

public class Task12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//check!
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		//събиране:
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3]; 
		
		//умножение:
		
		arr[4] = arr[4]*arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];
		
		for (int index = 0; index < arr.length; index++) {
			
			System.out.print(arr[index] + " ");
			
		}
		
		
		
	}

}
