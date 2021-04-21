package Assignment3;
/* 
 * this class has a method that perform exceptionHandling
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
public class IOChecked {
   public static void main(String[] args) 
	{
	    try
	    {
	        FileReader file = new FileReader("somefile.txt");
	    } 
	    catch (FileNotFoundException e) 
	    {
	        //Alternate logic
	       System.out.println(e);// e.printStackTrace();
	    }
	}
}
