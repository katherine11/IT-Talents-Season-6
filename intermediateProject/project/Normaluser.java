package project;

import exceptions.UserException;

public class Normaluser extends User {

	public Normaluser(String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(email, password, fullName, telephone, address, age);
	}

	@Override
	public void deleteAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		
	}

	
}
