package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.UserService;
import com.medet.hmrs.dataAccess.abstracts.UserDao;
import com.medet.hmrs.entities.concretes.User;
@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	
@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	
	

}
