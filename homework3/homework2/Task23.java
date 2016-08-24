
public class Task23 {

	public static void main(String[] args) {

		byte i = 1, j = 1;

		while (i <= 9) {

			while (j <= 9) {

				if (i <= j) {
					System.out.print(i + "*" + j + " ");
				}
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}

	}

}
