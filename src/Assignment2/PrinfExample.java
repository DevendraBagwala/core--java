package Assignment2;
/* 
 * This class method has perform print and string operation
 */
import java.util.Date;
import java.util.Locale;
public class PrinfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//date formating
		Date date = new Date();
	    System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
	    System.out.printf("  %1$tA  %1$tB %1$tY%n", date);
	    System.out.printf("  %1$td  %1$tB %1$tY%n", date);
	    System.out.printf(" %1$td %1$tm %1$ty%n", date);
	    
	    System.out.printf(Locale.US,"%,d%n", 10000);
	    System.out.printf("%,d%n", 10000);
	    System.out.printf("Simple integer:  %d%n", 10000L);
	    
	    System.out.printf("%f%n",5.1473);
	    System.out.printf("%5.2f%n",5.1473);
	    System.out.printf("%5.2e%n",5.1473);
	    
	    
	    // use of string concatenation, substring and joining method
	    int age=13;
	    String s = "name"+age;  
	    System.out.println(s);
	    System.out.println(s.substring(0, 3));
	    String all = String.join("/", "H","T","T","P");
	    System.out.println(all);



	}

}
