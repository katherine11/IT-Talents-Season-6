package project;


public interface IUser {

	boolean checkEmail(String email);
	boolean checkThePassword(String password);
	boolean checkNameAndAddress(String something);
	boolean checkTelephone(String telephone);
	void deleteAdvertisement(Advertisement advertisement);

}
