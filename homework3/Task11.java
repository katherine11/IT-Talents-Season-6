import java.util.Scanner;

public class Task11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//check!!
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}
		
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			
			if(arr[index] % 5 == 0 && arr[index] > 5){
				
				System.out.print(arr[index] + ", ");
				count++;
			}
			
		}
		
		System.out.println("- " + count + " numbers" );

	}

}
