package Assignment3;
/* 
 * This class has a method that perform exceptionHandling
 */
public class ExceptionHandling2 {

	public static void main(String[] args) {

		// example of Rethrowing new exception
		try {
			
			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {

			throw new NullPointerException("Invalid Input");

		}

	}

}
