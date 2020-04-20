package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
/**
 * Read more about log4j here "https://logging.apache.org/log4j/2.x/manual/customloglevels.html".
 * you can set log files to off by setting, .... level = off
 * */
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world     \n");
		
		logger.error("this is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		logger.info("This is an info message");
		
		System.out.println("\n logger display completed");
		
	}

}
