import java.util.Scanner;

public class Task07 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int x = 3;
		
		while(n != 0){
			
			if(x % 3 == 0){
				if(n == 1){
					System.out.print(x);
				}
				else{
					System.out.print(x + ", ");	
				}
				n--;
			}
				x++;
		}
	}
}
