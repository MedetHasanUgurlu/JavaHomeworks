package dataAccess.abstracats;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	User getUser(int id);
	ArrayList<User> getAllUser();
	
	
	

}
