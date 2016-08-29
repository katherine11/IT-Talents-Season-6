package accounts;

import java.util.Set;
import java.util.TreeSet;

import exceptions.UserException;
import project.Advertisement;

public abstract class User implements IUser {

	private static final int MIN_SYMBOLS_FOR_USERNAME = 5;
	private static final int MIN_AGE_REQUIRED = 16;
	private static final int LENGTH_OF_TELEPHONE_NUMBER = 10;
	private static final int CONDITION_TO_BE_PASSWORD = 3;
	private static final int MIN_PASSWORD_LENGTH = 6;

	private String username;
	private String email;
	private String password;
	private String fullName;
	private String telephone;
	private String address;
	private int age;
	protected Set<Advertisement> advertisements = new TreeSet<Advertisement>();

	User(String username, String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {

		if (checkUsername(username)) {
			this.username = username;
		}
		else{
			throw new UserException("Invalid username!");
		}

		if (checkEmail(email)) {
			this.email = email;
		} else {
			throw new UserException("Invalid email!");
		}

		if (checkThePassword(password)) {
			this.password = password;
		} else {
			throw new UserException("Invalid password!");
		}

		if (checkNameAndAddress(fullName)) {
			this.fullName = fullName;
		} else {
			throw new UserException("Invalid names!");
		}

		if (checkTelephone(telephone)) {
			this.telephone = telephone;
		} else {
			throw new UserException("Invalid phone number!");
		}

		if (checkNameAndAddress(address)) {
			this.address = address;
		} else {
			throw new UserException("Invalid address!");
		}

		if (age > MIN_AGE_REQUIRED) {
			this.age = age;
		} else {
			throw new UserException("Invalid age!");
		}
	}

	@Override
	public boolean login(String username, String password) {

		if (checkEmail(username) && checkThePassword(password)) {

			System.out.println("Login successful!!");
			return true;
		}
		System.out.println("Login was not successful. Please try again later! ");
		return false;

	}

	public String getUsername() {
		return username;
	}

	@Override
	public boolean checkTelephone(String telephone) {
		if (telephone.length() == LENGTH_OF_TELEPHONE_NUMBER) {
			for (int index = 0; index < telephone.length(); index++) {
				if (telephone.charAt(index) < '0' || telephone.charAt(index) > '9') {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean checkNameAndAddress(String something) {
		if (something != null && !something.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean checkUsername(String username) {
		if (username != null && username.length() > MIN_SYMBOLS_FOR_USERNAME) {

			if ((username.contains("_") || username.contains(".") || containsDigits(username))
					&& containsLowercaseLettersOnly(username)) {
				return true;
			}
		}
		return false;
	}

	private boolean containsLowercaseLettersOnly(String username) {
		
		for (int index = 0; index < username.length(); index++) {
			
			char currentSymbol = username.charAt(index);
			
			if(currentSymbol >= 'A' && currentSymbol <= 'Z'){
				return false;
			}
			
		}
		return true;
		
	}

	private boolean containsDigits(String username) {
		
		for (int index = 0; index < username.length(); index++) {
			
			char currentSymbol = username.charAt(index);
			
			if(currentSymbol  >= '0' && currentSymbol <= '9'){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		EmailValidator emailValidator = new EmailValidator();
		if (emailValidator.validate(email)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkThePassword(String password) {
		if (password != null && password.length() >= MIN_PASSWORD_LENGTH) {
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for (int index = 0; index < password.length(); index++) {
				if (password.charAt(index) >= 'a' && password.charAt(index) <= 'z') {
					if (count1 == 0) {
						count1++;
					}
				}
				if (password.charAt(index) >= 'A' && password.charAt(index) <= 'Z') {
					if (count2 == 0) {
						count2++;
					}
				}
				if (Character.isDigit(password.charAt(index))) {
					if (count3 == 0) {
						count3++;
					}
				}
				if (count1 + count2 + count3 == CONDITION_TO_BE_PASSWORD) {
					return true;
				}
			}
		}
		return false;
	}

}
