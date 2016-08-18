package project;

import java.util.Set;
import java.util.HashSet;

import exceptions.StorageException;

public class Storage implements IStorage{
	
	private Set<User> users = new HashSet<User>();
	
	@Override
	public void addUser(User user) throws StorageException{
		if(user != null){
			users.add(user);
		}else{
			throw new StorageException("Ne moga da dobavq usera zashtoto e nevaliden user!");
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
	public void addAdministrator(Administrator administrator) throws StorageException {
		// TODO Auto-generated method stub
		
	}
	
}
