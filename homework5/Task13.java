
public class Task13 {

	static int[] concatArrays(int[] arr1, int[] arr2) {

		int[] tempArr = new int[arr1.length + arr2.length];

		for (int index = 0; index < tempArr.length; index++) {

			if (tempArr[index] == arr1.length) {

				tempArr[index] = arr2[index];
			}
			else{
				tempArr[index] = arr1[index];
			}
		}

		return tempArr;

	}

	public static void main(String[] args) {

		int[] testArray1 = { 1, 2, 54, 22, 1432, 1232, 2 };
		int[] testArray2 = { -31, -434, 435, 0, 53445, -43 };

		int maxLength = testArray1.length + testArray2.length;
		int[] result = new int[concatArrays(testArray1, testArray2).length];

		for (int index = 0; index < maxLength; index++) {

			result[index] = concatArrays(testArray1, testArray2)[index];

		}

		for (int index = 0; index < maxLength; index++) {

			System.out.println(result[index] + " ");
		}

	}

}
