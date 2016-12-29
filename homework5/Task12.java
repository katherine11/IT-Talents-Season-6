
public class Task12 {

	static int[] returnNumbers(int n) {

		int[] tempArr = new int[n];

		for (int index = 0; index < tempArr.length; index++) {

			int value = 1;
			tempArr[index] = value;
			++value;

		}

		return tempArr;

	}


	public static void main(String[] args) {

		int []arr = new int[5];
		
		for (int index = 0; index < arr.length; index++) {
			
			arr[index] = returnNumbers(5)[index];
			
		}
		
		for (int index = 0; index < arr.length; index++) {
			
			System.out.print(arr[index] + " ");
		}
		
	}

}
