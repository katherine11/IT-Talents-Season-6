
import java.util.Scanner;

public class TasksInClass03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] symbols = { '@', '%', '*', '&', '$', '#', 'd', 'r', 'w' };

		System.out.println("Symbol: ");

		char ch = sc.next().charAt(0);
		
		int indexS = -1;
		
		for (int index = 0; index < symbols.length; index++) {

			if (symbols[index] == ch) {

				indexS = index;
				break;
				
			} 

		}
		
		if(indexS != -1){
			System.out.println("Index = " + indexS);
			
		}
		else{

			System.out.println("It's not there! ");
		}

	}

}
