package accounts;

import exceptions.UserException;
import project.Advertisement;

public class Administrator extends User {
		
	public Administrator(String username, String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(username, email, password, fullName, telephone, address, age);
	}

	@Override
	public void deleteAdvertisement(Advertisement advertisement) throws UserException {
		// TODO Auto-generated method stub
		
	}
	
}
