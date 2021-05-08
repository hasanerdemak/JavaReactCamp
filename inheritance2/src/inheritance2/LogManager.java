package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritabanýna loglandý.");
		}else if (logType == 2) {
			System.out.println("Dosyaya loglandý.");
		}else {
			System.out.println("Email loglandý.");
		}
		
	}
}


//1- Database
//2- File
//3- Email

//Birbirinin alternatifi olan kod bloklarý "if"le yönetilemez.
//Alternatifleri kendi sýnýflarýnýn içinde oluþturarak kodla -> ...Logger