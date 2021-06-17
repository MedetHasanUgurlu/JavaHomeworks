package business.concretes;

import business.abstracts.UserService;
import core.abstracts.EMailCheckService;
import core.concretes.EMailCheckManager;
import dataAccess.abstracats.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userdao;
	private EMailCheckService eMailCheckService;
	
	public UserManager(UserDao userdao,EMailCheckService eMailCheckService) {
		this.userdao = userdao;
		this.eMailCheckService = eMailCheckService;
		
	}
		
		
	



	@Override
	public boolean login(User user) {
		boolean x = false;
		// TODO Auto-generated method stub
		for(User u: userdao.getAllUser()) {
			if(user.geteMail().equals(u.geteMail())&&user.getPassword().equals(u.getPassword())) {
				return true;
		
			}

		}
		return false;
		
	}

	@Override
	public boolean register(User user) {
		EMailCheckManager MANAGE = new EMailCheckManager();
		
		boolean register= false;
		// TODO Auto-generated method stub
		if(user.getPassword().length()<6) {
			System.out.println("Please set the passsword at least 6 character  .");
			return false;
			
		}
		if(!MANAGE.emailCheckRegex(user)) {
			
			System.out.println("İnvalid mail");
			return false;
			
	
			
			
		}
		for(User u: userdao.getAllUser()) {
			if(user.geteMail()== u.geteMail()) {
				
				System.out.println("These mail have been used.");
				return false;
			}
			
		}
		
		if(user.getFirstName().length()<2&&user.getLastName().length()<2) {
			
			System.out.println("Please set the First Name and Last Name at least 2 character  .");
			return false;
		}
		
		userdao.add(user);
		return true;
		
		
		
	}

	@Override
	public void verifyEmail(User user) {
		// TODO Auto-generated method stub
		if(register(user)) {
			eMailCheckService.sentMail(user);
			
			
		}
		
	}

	@Override
	public void loginWithGoogle(User user) {
		// TODO Auto-generated method stub
		
	}
	}
