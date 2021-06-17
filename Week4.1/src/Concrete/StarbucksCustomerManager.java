package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager implements ICustomerService {
	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
		
	}
	
	
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		if(_customerCheckService.CheckIfRealPerson()) {
			System.out.println(customer.getFirstName()+" " +customer.getLastName() +" is added");
			
		}else
			System.out.println("Not valid user.");
		
		
		
	}

}
