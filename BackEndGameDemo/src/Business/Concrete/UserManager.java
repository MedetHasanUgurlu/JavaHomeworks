package Business.Concrete;

import Business.Abstract.IUserService;
import Entity.Concrete.User;

public class UserManager implements IUserService{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getId()+ " is added.");
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getId()+ " is deleted.");
		
	}

}
