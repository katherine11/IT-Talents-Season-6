package project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import exceptions.UserException;

public abstract class User implements IUser {

	private static final int MIN_AGE_REQUIRED = 16;

	private static final int LENGTH_OF_TELEPHONE_NUMBER = 10;
	private static final int CONDITION_TO_BE_PASSWORD = 3;
	private static final int MIN_PASSWORD_LENGTH = 6;

	private String email;
	private String password;
	private String fullName;
	private String telephone;
	private String address;
	private int age;
	private Set<Advertisement> advertisements = new HashSet<Advertisement>();

	User(String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		if (checkEmail(email)) {
			this.email = email;
		} else {
			throw new UserException("Nevaliden email!");
		}

		if (checkThePassword(password)) {
			this.password = password;
		} else {
			throw new UserException("Nevalidna parola!");
		}

		if (checkNameAndAddress(fullName)) {
			this.fullName = fullName;
		} else {
			throw new UserException("Nevalidni tri imena!");
		}

		if (checkTelephone(telephone)) {
			this.telephone = telephone;
		} else {
			throw new UserException("Nevaliden telefonen nomer!");
		}

		if (checkNameAndAddress(address)) {
			this.address = address;
		} else {
			throw new UserException("Nevaliden adres!");
		}

		if (age > MIN_AGE_REQUIRED) {
			this.age = age;
		} else {
			throw new UserException("Nevalidni godini!");
		}
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
	public boolean checkEmail(String email) {
		EmailValidator emailValidator = new EmailValidator();
		if (emailValidator.validate(email)) {
			return true;
		} else {
			System.out.println("Nevaliden email!");
			return false;
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
