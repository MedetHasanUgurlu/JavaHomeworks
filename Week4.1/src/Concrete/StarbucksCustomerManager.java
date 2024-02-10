package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager implements ICustomerService {
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.CheckIfRealPerson()) {
			System.out.println("Name: {} Surname: {} is added",customer.getFirstName(),customer.getLastName());
			
		}else
			System.out.println("Not valid user.");
		
		
		
	}

}
