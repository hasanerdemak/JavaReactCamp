package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroð");
		engin.setNationalIdentity("1000000");
		engin.setCustomerNumber("12345");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCompanyName("Hepsi Burada");
		hepsiBurada.setCustomerNumber("78910");
		
		UnionCustomer uC = new UnionCustomer();
		uC.setCustomerNumber("99999");
		
		CustomerManager customerManager = new CustomerManager();
		/*
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(uC);
		*/
		
		Customer[] customers = {engin, hepsiBurada, uC};
		
		customerManager.addMultiple(customers);
		
		
		
	}

}