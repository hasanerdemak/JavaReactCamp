package inheritance2;

public class CustomerManager {
	public void add(Logger logger) { //Bana Logger�n�n ne oldu�unu s�yle
		System.out.println("M��teri eklendi");
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		//�� yapan s�n�f, ba�ka bir i� yapan s�n�f� kullanacaksa asla somut s�n�ftan gidilmez
		//Somut s�n�f->�� yapan s�n�f
		*/
		
		logger.log();
	}
}