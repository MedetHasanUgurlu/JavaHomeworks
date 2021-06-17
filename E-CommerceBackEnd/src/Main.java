import java.util.ArrayList;
import java.util.Scanner;

import business.concretes.UserManager;
import core.abstracts.EMailCheckService;
import core.concretes.EMailCheckManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<User> userList = new ArrayList<User>();
		User user1 = new User("Medet", "Ugurlu", "mdt.hsn.76@hotmail.com", "123456");
		User user2 = new User("Mehmet", "Ugurlu", "mdt.hsn.75@hotmail.com", "12345");
		User user3 = new User("Metehan", "Ugurlu", "mdt.hsn.74@hotmail.com", "1234");
		User user4 = new User("Melike", "Ugurlu", "mdt.hsn.73@hotmail.com", "123");
		User user5 = new User("Melih", "Ugurlu", "mdt.hsn.72@hotmail.com", "12");
		
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		
		HibernateUserDao hibernateUserDao = new HibernateUserDao(userList);
		UserManager manager = new UserManager(hibernateUserDao, new EMailCheckManager());
		
		String islemler = "1- Login\n"+
						"2- Register\n"+"Exit for 3"
				;
						
		System.out.println(islemler);
		
		while(true) {
			
			
			
			
			
			
			
			int inPUT = scanner.nextInt();
			if(inPUT==3) {
				System.out.println("System will shutdown");
				Thread.sleep(3000);
				break;
				
				
			}
			if(inPUT==1) {
				
				System.out.println("Enter the eMail");
				String eMail = scanner.nextLine();
				scanner.next();
				System.out.println("Enter the password");
				String password = scanner.nextLine();
				
			
			}else if(inPUT==2) {
				System.out.println("Enter the FirstName");
				String firstName = scanner.nextLine();
				scanner.next();
				System.out.println("Enter the lastName");
				String lastName = scanner.nextLine();
				scanner.next();
				System.out.println("Enter the eMail");
				String eMail = scanner.nextLine();
				scanner.next();
				System.out.println("Enter the password");
				String password = scanner.nextLine();
				scanner.next();
				User newUser = new User(firstName, lastName, eMail, password);
				if(manager.register(newUser)) {
					System.out.println("Kullanıcı kayıt oldu");
					hibernateUserDao.add(newUser);
				} else {
					
					System.out.println("Register was failed");
				}
				}
				
			}
			
		
		
		
		
	

		
		
		
	}

}
