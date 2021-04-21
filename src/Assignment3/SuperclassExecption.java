package Assignment3;
/*   
 * This class has a method that perform exceptionHandling
 */
import java.io.*;
public class SuperclassExecption {

	// SuperClass doesn't declare any exception
		void method() throws IOException
		{
			System.out.println("SuperClass");
		}
}

//SuperClass inherited by the SubClass
class SubClass extends SuperclassExecption {
	void method() throws IOException
	{
		System.out.println("SubClass");
	}

public static void main(String args[]) throws IOException
	{
		SuperclassExecption s = new SubClass();
		s.method();
	}
}