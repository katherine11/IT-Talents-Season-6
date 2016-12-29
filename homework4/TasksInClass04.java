
import java.util.Scanner;

public class TasksInClass04 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1 };

		int[] newarr = new int[arr.length];

		int index = 0;
		int count0 = 0;
		int count1 = arr.length - 1;

		while (count0 <= count1 && index <= arr.length - 1) {

			if (arr[index] == 0) {
				newarr[count0] = arr[index];
				count0++;
			}

			if (arr[index] == 1) {
				newarr[count1] = arr[index];
				count1--;
			}

			index++;
		}

		for (int index1 = 0; index1 < newarr.length; index1++) {

			System.out.print(newarr[index1] + " ");

		}

	}

}
