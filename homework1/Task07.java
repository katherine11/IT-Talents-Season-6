import java.util.Scanner;

public class Task07 {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		double money = sc.nextDouble();
		boolean isHealthy = sc.nextBoolean();
		
		if(isHealthy == false){
			
			System.out.println("I won't go out today. ");
			
			if(money > 0){
				System.out.println("I'm gonna buy some medicine. ");
			}
			else{
				System.out.println("I'm gonna stay at home drinking tea. ");
			}
		}
		
		else{
			if(money < 10){
				System.out.println("I'm going to the cafe. ");
			}
			else{
				System.out.println("I'm going to the cinema with friends. ");
			}
		}
	}
}
