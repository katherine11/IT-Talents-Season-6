import java.util.Scanner;

public class Task04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int index = 0; index < arr.length; index++) {

			System.out.print("arr[" + index + "]= ");
			arr[index] = sc.nextInt();

		}

		
		boolean mirror = false;

		int currentInd = arr.length - 1;
		
		int index = 0;
		
		while(index <= currentInd){
			
			if (arr[index] != arr[currentInd]) {
				break;
			}
			else{
				mirror = true;
			}
			
			index++;
			currentInd--;		
		}
		

		if (mirror) {

			System.out.println("Mirror-like! ");

		} else {

			System.out.println("Not mirror-like! ");
		}

	}

}
