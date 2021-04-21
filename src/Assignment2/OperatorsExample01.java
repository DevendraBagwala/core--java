package Assignment2;
/* 
 * This class has a method perform general Operations on operands 
 */
public class OperatorsExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration of variables
		int num1 = 90;
		int num2 = 30;
		
		//arithmetic addition
		int sum = num1+num2;
		System.out.println(sum);
		
		//arithmetic subtraction
		int subtract = num1-num2;
		System.out.println(subtract);
		
		//arithmetic multiplication
		int multiply = num1*num2;
		System.out.println(multiply);
		
		//arithmetic division
		int divide = num1/num2;
		System.out.println(divide);
		
		//arithmetic modulus
		int modulus = num1%num2;
		System.out.println(modulus);
		
		//use of unary operator
		//per increment operator
		int m=8;
		int p = 2 * ++m;
		System.out.println(p);
		
		//post increment operator
		int n=8;
		int q = 2 * n++;
		System.out.println(q);
		
		//Per-decrement operator
		int x=8;
		int y = 2 * --x;
		System.out.println(y);
				
		//post decrement operator
		int z=8;
		int a = 2 * z--;
		System.out.println(a);
		
		//Relational and MiscOperators 
		//<=(less than or equal to operator)
	    boolean b = (num1<=num2)?true:false;
	    System.out.println(b);
	    
	    //<=(greater than or equal to operator)
	    boolean b1 = (num1>=num2)?true:false;
	    System.out.println(b1);
	    
	   //==(equality) and !=(Inequality) operator
	    boolean b2 = (num1==num2)?true:(num1!=num2)?true:false;
	    System.out.println(b2);
		
	}

}
