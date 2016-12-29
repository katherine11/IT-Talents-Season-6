
import java.util.Scanner;

public class TasksInClass02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Size:");

		int number = sc.nextInt();

		int[] arr = new int[number];

		for (int index = 0; index < arr.length; index++) {

			System.out.println("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}

		boolean zigzag = true;

		for (int index = 1; index < arr.length - 1; index++) {

			int prevElement = arr[index - 1];
			int nextElement = arr[index + 1];
			int currentElement = arr[index];
			
			if(arr[index] == arr[index + 1]){
				break;
			}
			
			boolean isBigger = (currentElement > prevElement && currentElement > nextElement);
			boolean isSmaller = (currentElement < prevElement && currentElement < nextElement); 
		
				if (!(isSmaller || isBigger)) {
					
					zigzag = false;
					break;
				}
			} 


		if (zigzag) {

			System.out.println("Zigzag row! ");
		} else {

			System.out.println("Not a zigzag row! ");
		}

	}
}
