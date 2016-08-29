package accounts;

import java.util.Set;
import java.util.HashSet;

import exceptions.StorageException;
import exceptions.UserException;

public class Storage implements IStorage{
	
	private static final int MAX_ADMINISTRATORS_COUNT = 2;
	private static byte administratorsCount = 0;
	private Set<User> users = new HashSet<User>();
	
	@Override
	public void addUser(User user) throws StorageException{
		if(user != null){
			this.users.add(user);
		}else{
			throw new StorageException("Cannot add an invalid user!");
		}
	}
	 

	@Override
	public boolean searchUser(User user) throws StorageException{
		if(user != null){
			for(User user1 : users){
				if(user1.equals(user)){
					return true;
				}
			}
		}		
		return false;
	}


	@Override
	public void addAdministrator(Administrator administrator) throws StorageException, UserException {
		
		if(administratorsCount > MAX_ADMINISTRATORS_COUNT){
			throw new UserException("Cannot add more than " +MAX_ADMINISTRATORS_COUNT+ " administrators!");
		}
		
		if(administrator != null){
			this.users.add(administrator);
			administratorsCount++;
		}
	}
	
	public Set<User> getUsers() {
		return users;
	}

	
}
