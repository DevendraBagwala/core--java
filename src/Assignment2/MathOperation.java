package Assignment2;
/* 
 * This class has a method that perform  math operations
 * for example  in this case Not a Number NaN math fun^c 
 */
public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for check NaN (not a number)
		float number = 0.0f/0.0f;
		System.out.println(number);
	    double num1 = Math.sqrt(-1);
	    System.out.println(num1);
	    
	    //compare NaN(not a number)
	    if( Float.isNaN(number) == Double.isNaN(num1))
	    	System.out.println("true");
	    else
	    	System.out.println("false");
	    
		 
		// for check infinity
		float value1 = 10.0f/0;
		System.out.println(value1);

		// for check -infinity
		float value2 = -10.0f/0;
		System.out.println(value2);

	}

}
