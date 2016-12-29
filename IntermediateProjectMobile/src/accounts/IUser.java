package accounts;

import exceptions.UserException;
import project.Advertisement;

public interface IUser {

	boolean checkUsername(String username);
	boolean checkEmail(String email);
	boolean checkThePassword(String password);
	boolean checkNameAndAddress(String something);
	boolean checkTelephone(String telephone);
	boolean login(String username, String password);
	void deleteAdvertisement(Advertisement advertisement) throws UserException;

}
