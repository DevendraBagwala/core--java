package Assignment2;
/* 
 * This is type-casting 
 */
public class TypecastingEx {

	public static void main(String args[]) {

		// type casting
		// explicit type casting long to int
		long num1 = 9372828920L;
		int num2 = (int) num1;
		System.out.println(num2);

		// char to integer
		char ch3 = 'h';
		int num3 = (int) ch3;
		System.out.println(num3);

		// implicit type casting char to integer
		int num4 = 'a' + 5;
		System.out.println(num4);

		// implicit type casting integer to char
		char ch4 = 'a' + 6;
		System.out.println(ch4);

	}
}
