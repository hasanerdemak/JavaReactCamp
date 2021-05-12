package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	//ICustomerCheckService customerCheckService;
	
	//public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
	//	this.customerCheckService = _customerCheckService;
	//}

	@Override
	public void save(Customer customer) throws Exception {
	//	if (customerCheckService.checIfRealPerson(customer)) {
			super.save(customer);	
	//	}else {
	//		throw new Exception("Not a valid person");	
	//	}
	}


}
