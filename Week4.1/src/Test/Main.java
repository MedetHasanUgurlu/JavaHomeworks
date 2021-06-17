package Test;

import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(56, "Bumin", "Kagan", "21213562321");
		StarbucksCustomerManager manager = new StarbucksCustomerManager(new CustomerCheckManager());
		manager.Save(customer1);
		
		
		
		

	}

}
