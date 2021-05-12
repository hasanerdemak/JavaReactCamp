package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return (customer.getNationalityId().length() == 11); //Mernis Doðrulamasý olmalý
	}

}
