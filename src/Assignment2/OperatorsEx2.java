package Assignment2;
/* 
 * This class has a method that perform math operations
 * i.e, logical,bitwise and assignment operations
 */
public class OperatorsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bitwise operator
		int num1 = 8;
		int num2 = 5;
		
		//bitwise signed >> (right shift) operator
		int num3 = num1>>2;
		System.out.println(num3);
		
		//bitwise signed << (left shift) operator
		num3 = num1<<2;
		System.out.println(num3);
		
		//bitwise unsigned >> (right shift) operator
		num3 = num1>>>3;
		System.out.println(num3);
				
		//bitwise & "and" operator
		num3 = num1 & num2;
		System.out.println(num3);
		
		//bitwise | "or" operator
		num3 = num1 | num2;
		System.out.println(num3);
		
		//bitwise ^ "XOR" operator
		num3 = num1 ^ num2;
		System.out.println(num3);
		
		//bitwise ~ "not" operator
		num3 = ~num2;
		System.out.println(num3);
				
				
		
		//logical && "and" operator
		boolean b = (num1>num2)&&(num1<num2);
		System.out.println(b);
				
		//logical || "or" operator
		b = (num1<num2)||(num1>num2);
		System.out.println(b);
		
		
		//Assignment Operators
		num2 = num1;
		System.out.println(num2);
		 
		num1 += num2;
		System.out.println(num1);
		  
		num2 *=num1;
		System.out.println(num2);
		
		num2 /=num1;
		System.out.println(num2);

	}
}
