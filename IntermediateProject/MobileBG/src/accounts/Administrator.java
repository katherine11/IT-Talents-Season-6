package accounts;

import java.util.Iterator;

import exceptions.UserException;
import project.Advertisement;

public class Administrator extends User {
	
	private Storage storage;
	
	public Administrator(String username, String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(username, email, password, fullName, telephone, address, age);
	}

	
	@Override
	public void deleteAdvertisement(Advertisement advertisement) throws UserException {

		if(advertisement != null){
			for (Iterator<User> it = this.storage.getUsers().iterator(); it.hasNext();) {
				if(it.next().advertisements.contains(advertisement)){
					it.remove();
				}
			}
		}
		else{
			throw new UserException("Cannot delete non-existing advertisement!");
		}
		
		
	}
	
}
