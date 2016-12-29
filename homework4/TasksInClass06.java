
public class TasksInClass06 {

	public static void main(String[] args) {

		char[][] symbols = { 
				{ '%', '@', '#', 'w' }, 
				{ '!', '3', '~', '*' }, 
				{ '$', '5', '+', 'd' },
				{ 'h', '8', 'c', '-' }

		};

		for (int rows = 0; rows < symbols.length; rows++) {

			for (int cols = 0; cols < symbols[rows].length; cols++) {

				if (rows == cols) {
					System.out.print(symbols[rows][cols] + " ");
				}

			}

		}

	}

}
