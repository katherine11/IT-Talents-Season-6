import java.util.Scanner;

public class Task17 {

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

		boolean zigzag = false;

		for (int index = 1; index < arr.length - 1; index++) {

			if (index % 2 == 1) {
				if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {

					zigzag = true;
				} else {
					zigzag = false;
					break;
				}
			}
			else{
				if(arr[index] < arr[index - 1] && arr[index] < arr[index + 1]){
					
					zigzag = true;
				}
				else{
					zigzag = false;
					break;
				}
			}

		}

		if (zigzag) {
			System.out.println("An ascending zig-zag like row! ");
		} else {
			System.out.println("NOT an ascending zig-zag like row! ");
		}

	}

}
