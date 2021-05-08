package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritaban�na logland�.");
		}else if (logType == 2) {
			System.out.println("Dosyaya logland�.");
		}else {
			System.out.println("Email logland�.");
		}
		
	}
}


//1- Database
//2- File
//3- Email

//Birbirinin alternatifi olan kod bloklar� "if"le y�netilemez.
//Alternatifleri kendi s�n�flar�n�n i�inde olu�turarak kodla -> ...Logger