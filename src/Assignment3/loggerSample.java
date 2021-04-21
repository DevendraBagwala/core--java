package Assignment3;
/* 
 * this class has a method perform loggers operation 
 */

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loggerSample {

	public static void main(String[] args) throws InterruptedException {
		Logger logger = Logger.getAnonymousLogger();
		Logger logger2 = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		logger.setLevel(Level.FINE);
		ConsoleHandler handler = new ConsoleHandler();
		
		handler.setLevel(Level.FINE);
		logger.addHandler(handler);
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			logger.log(Level.FINE,e.getMessage());
		}
		
		
	}
	
/*	public static void main(String[] args) throws InterruptedException{
		try {
			
			System.out.println(10/0);
			} catch (ArithmeticException e) {
				
				throw new NullPointerException("Invalid Input");
			}
		   finally {
			   System.out.println("Finally Block");
		   }
		}*/
	
}
