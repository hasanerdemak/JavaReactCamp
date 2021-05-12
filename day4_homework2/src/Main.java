import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(1, "Hasan Erdem", "AK", "01.01.1234", "2345678910"));
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.save(new Customer(1, "Hasan Erdem", "AK", "01.01.1234", "2345678910"));
		
	}

}
