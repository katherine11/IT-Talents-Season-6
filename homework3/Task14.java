import java.util.Scanner;

public class Task14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		
		int size = sc.nextInt();
		
		double [] realarr = new double [size];
		
		for (int index = 0; index < realarr.length; index++) {
			
			System.out.print("arr[" + index + "]= ");
			realarr[index] = sc.nextDouble();
		}
		
		for (int index = 0; index < realarr.length; index++) {
			
			if(realarr[index] >= -2.99 && realarr[index] <= 2.99){
				
				System.out.print("Result: " + realarr[index] + " ");
				
			}
		}
		
	}

}
