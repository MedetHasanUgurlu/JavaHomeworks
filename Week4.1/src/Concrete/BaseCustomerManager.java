package Concrete;

import Abstract.ICustomerService;
import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+  " is added.");
	}

}
