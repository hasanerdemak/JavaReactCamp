package interfaces;

public class CustomerManager {
	//3- Dependency Injection Design Pattern
	private Logger[] loggers; // 4- Loglamaya gev�ek ba��ml� hale getirdik. Interface'e ba�l�
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//1- loosely - tightly coupled
	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		/*
		DatabaseLogger logger = new DatabaseLogger(); // 2- Sistemi loglamaya kat� bir �ekilde ba�l�, gev�etece�iz
		logger.log(customer.getFirstName() + " veri taban�na logland�");
		*/
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
