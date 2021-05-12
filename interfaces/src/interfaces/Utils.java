package interfaces;

public class Utils { //Utilities-> Araçlar
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
