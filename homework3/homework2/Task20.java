import java.util.Scanner;

public class Task20 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte iterations = 10;
		byte interIterations = 10;
		byte curNum = 1;

		while (iterations > 0) {

			while (interIterations > 0) {

				System.out.print(curNum + " ");
				curNum++;

				if (curNum > 9) {
					curNum = 0;
				}

				interIterations--;

			}

			System.out.println();

			curNum++;
			interIterations = 10;
			iterations--;

		}
	}
}
