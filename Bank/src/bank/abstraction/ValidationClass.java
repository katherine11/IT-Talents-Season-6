package bank.abstraction;

public abstract class ValidationClass {
	
	public static boolean isValidString(String str){
		return !(str == null || str.length() == 0);
	}

}
