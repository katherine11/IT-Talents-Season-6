package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;

	SecuredNotepad(Page[] pages) {
		super(pages);
		this.password = this.enterFirstPassword();
	}

	@SuppressWarnings("resource")
	String enterFirstPassword() {
		System.out.println("First time using this secured notepad? Please enter a password which you can use it with: ");
		Scanner sc = new Scanner(System.in);
		String password = "";
		do {
			System.out.println("Please enter a password containing at least 1 small letter, 1 big letter, 1 number and length 5: ");
			password = sc.next();
		} 
		
		while (!highlySecured(password));
		return password;
	}

	static boolean highlySecured(String password){
		
		boolean isDigit = false;
		boolean isSmallLetter = false;
		boolean isBigLetter = false;
		
		if(password.length() > 5){
			for (int index = 0; index < password.length(); index++) {
				if(password.charAt(index) >= '0' && password.charAt(index) <= '9'){
					isDigit = true;
				}
				
				if(password.charAt(index) >= 'A' && password.charAt(index) <= 'Z'){
					isBigLetter = true;
				}
				
				if(password.charAt(index) >= 'a' && password.charAt(index) <= 'z'){
					isSmallLetter = true;
				}
			}
			
			return isDigit && isBigLetter && isSmallLetter;
		}
		return false;
		
	}

	static boolean correctPassword(String password) {
		return password != null && password != "";
	}

	@Override
	public void addTextOnPage(String text, int number) {
		this.enterPassword();
		super.addTextOnPage(text, number);
	}

	void enterPassword() {
		System.out.println("Please enter your password in order the action to be done! ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String password = "";
		byte index = 0;

		do {
			if (index >= 1) {
				System.out.println("Incorrect password! Please try again! ");
			}

			System.out.println("Password: ");
			password = sc.next();
			index++;

		} while (!this.getPassword().equals(password));
	}

	@Override
	public void replaceTextOnPage(String text, int number) {
		this.enterPassword();
		super.replaceTextOnPage(text, number);
	}

	@Override
	public void deleteTextOnPage(int number) {
		this.enterPassword();
		super.deleteTextOnPage(number);
	}

	@Override
	public boolean searchForAWord(String word) {
		this.enterPassword();
		return super.searchForAWord(word);
	}

	@Override
	public void printAllPagesWithDigits() {
		this.enterPassword();
		super.printAllPagesWithDigits();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (correctPassword(password)) {
			this.password = password;
		}
	}
}
