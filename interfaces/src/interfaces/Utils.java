package interfaces;

public class Utils { //Utilities-> Ara�lar
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
