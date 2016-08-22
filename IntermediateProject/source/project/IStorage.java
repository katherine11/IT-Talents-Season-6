package project;

import exceptions.StorageException;

public interface IStorage {
	
	void addUser(User user) throws StorageException;
	boolean searchUser(User user) throws StorageException;
	void addAdministrator(Administrator administrator) throws StorageException;
	
}
