package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checIfRealPerson(Customer customer) {
		return (customer.getNationalityId().length() == 11); //Mernis Doðrulamasý olmalý
	}

}
