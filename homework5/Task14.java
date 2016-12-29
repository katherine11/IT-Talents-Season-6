
public class Task14 {

	static long factorial(int n){

		if(n < 0){
			return -1;
		}
		
		if(n > Integer.MAX_VALUE){
			return 0;
		}
		

		long fact = 1;
		
		for (int index = 1; index <= n; index++) {
			
			fact *= index;
		}
		
		return fact;
		
	}
	
	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorial(-9));
		System.out.println(factorial(600_000_000));
		
	}

}
