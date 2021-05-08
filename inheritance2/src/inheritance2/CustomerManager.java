package inheritance2;

public class CustomerManager {
	public void add(Logger logger) { //Bana Loggerýnýn ne olduðunu söyle
		System.out.println("Müþteri eklendi");
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		//Ýþ yapan sýnýf, baþka bir iþ yapan sýnýfý kullanacaksa asla somut sýnýftan gidilmez
		//Somut sýnýf->Ýþ yapan sýnýf
		*/
		
		logger.log();
	}
}