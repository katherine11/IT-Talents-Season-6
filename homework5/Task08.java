import java.util.Scanner;

public class Task08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = sc.next();
		
		boolean palindrome = true;
		int index = 0, temp = string.length() - 1;
		
		while(index <= temp){
			
			if(string.charAt(index) != string.charAt(temp)){
				palindrome = false;
				break;
			}
			else{
				temp--;
				index++;
			}
			
		}
		
		if(palindrome){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
		
		
	}

}
