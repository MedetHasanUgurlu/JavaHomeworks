package business.abstracts;

import entities.concretes.User;

public interface UserService {
	boolean login(User user);
	boolean register(User user);
	void verifyEmail(User user);
	void loginWithGoogle(User user);
	

	

}
