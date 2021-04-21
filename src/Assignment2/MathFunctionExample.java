package Assignment2;
/* 
 * In This class we use Math Function 
 * @author devendra
 */
/* 
 * this class has a method that perform Math operation
 */
public class MathFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 = 20;
		
		
		System.out.println("Square root of " + num2 + " is = " + Math.sqrt(num2));   //math square-root fun^c
        
		System.out.println("Power of " + num1 + " is = " + Math.pow(num1,2));   // math power function
		
		System.out.println(Math.multiplyExact(num1, num2));   // math multiply fun^c
		
		System.out.println(Math.addExact(num1, num2));		// math addition fun^c
		
		System.out.println(Math.subtractExact(num2, num1));  //math subtract fun^c
		
		System.out.println(Math.incrementExact(num1));		//math increment fun^c
		
		System.out.println(Math.decrementExact(num2));    //math decrement fun^c
		
		System.out.println(Math.negateExact(num2));      //math negate fun^c
	}
}
