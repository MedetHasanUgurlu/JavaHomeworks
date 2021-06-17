package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracats.UserDao;
import entities.concretes.User;

public class HibernateUserDao  implements UserDao{

	private ArrayList<User> userList;
	
	public HibernateUserDao(ArrayList<User> userList) {
		this.userList =userList;
		
	}
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		userList.add(user);
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " is added.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userList.remove(user);
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " is deleted.");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAllUser() {
		// TODO Auto-generated method stub
		return userList;
	}

}
