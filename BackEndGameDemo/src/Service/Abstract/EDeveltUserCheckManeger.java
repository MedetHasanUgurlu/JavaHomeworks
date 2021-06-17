package Service.Abstract;

import Entity.Concrete.User;

public class EDeveltUserCheckManeger extends BaseUserCheckService{

	@Override
	public void CheckUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" "+user.getId()+" is checking");
		
	
		
		
	}

}
