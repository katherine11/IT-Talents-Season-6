import java.util.Scanner;

public class Task21 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte cardNumber;

		do {

			System.out.println("Enter a card number: ");
			cardNumber = sc.nextByte();

		} while (cardNumber < 1 || cardNumber > 51);

		while (cardNumber <= 53) {

			for (int i = 2; i <= 53; i++) {

				if (cardNumber == i) {

					if (i >= 2 && i <= 10) {
						System.out.println(i + " Clubs");
					} else {
						switch (i) {

						case 11:
							System.out.println("Jack Clubs");
							break;
						case 12:
							System.out.println("Queen Clubs");
							break;
						case 13:
							System.out.println("King Clubs");
							break;
						case 14:
							System.out.println("Ace Clubs");
							break;
						}
					}

					if (i >= 15 && i <= 23) {
						System.out.println((i - 13) + " Diamonds");

					} else {

						switch (i) {

						case 24:
							System.out.println("Jack Diamonds");
							break;
						case 25:
							System.out.println("Queen Diamonds");
							break;
						case 26:
							System.out.println("King Diamonds");
							break;
						case 27:
							System.out.println("Ace Diamonds");
							break;

						}

						if (i >= 28 && i <= 36) {
							System.out.println((i - 26) + " Hearts");
						} else {

							switch (i) {

							case 37:
								System.out.println("Jack Hearts");
								break;
							case 38:
								System.out.println("Queen Hearts");
								break;
							case 39:
								System.out.println("King Hearts");
								break;
							case 40:
								System.out.println("Ace Hearts");
								break;
							}

							if (i >= 41 && i <= 49) {
								System.out.println((i - 39) + " Spades");
							}

							else {

								switch (i) {

								case 50:
									System.out.println("Jack Spades");
									break;
								case 51:
									System.out.println("Queen Spades");
									break;
								case 52:
									System.out.println("King Spades");
									break;
								case 53:
									System.out.println("Ace Spades");
									break;
								}
							}
						}
					}
				}
			}
			cardNumber++;
		}
	}
}