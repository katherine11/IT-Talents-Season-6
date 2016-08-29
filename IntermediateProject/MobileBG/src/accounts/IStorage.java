package accounts;

import exceptions.StorageException;
import exceptions.UserException;

public interface IStorage {
	
	void addUser(User user) throws StorageException;
	boolean searchUser(User user) throws StorageException;
	void addAdministrator(Administrator administrator) throws StorageException, UserException;
	
}
