package project;

import java.util.SortedSet;

import exceptions.UserException;

public class Administrator extends User {
	
	private Storage storage;
	
	public Administrator(String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(email, password, fullName, telephone, address, age);
	}

	@Override
	public void deleteAdvertisement(Advertisement advertisement) {
		
	}
	
}
