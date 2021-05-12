package interfaces;

public class CustomerManager {
	//3- Dependency Injection Design Pattern
	private Logger[] loggers; // 4- Loglamaya gevþek baðýmlý hale getirdik. Interface'e baðlý
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//1- loosely - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		/*
		DatabaseLogger logger = new DatabaseLogger(); // 2- Sistemi loglamaya katý bir þekilde baðlý, gevþeteceðiz
		logger.log(customer.getFirstName() + " veri tabanýna loglandý");
		*/
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
