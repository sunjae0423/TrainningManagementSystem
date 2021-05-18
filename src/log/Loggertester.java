package log;

public class Loggertester {

	public static void main(String[] args) {
		Eventlogger logger = new Eventlogger("log.txt");
		logger.log("test");

	}

}
