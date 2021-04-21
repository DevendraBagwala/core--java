package Assignment2;
/* 
 * This class has a method represent Long, binary, octal and hexadecimal values
 */
public class Represent {

	public static void main(String args[]){
		// represent long
		long l= 5000l;
		System.out.println(l);
		
		
		//represent binary number
		int binary=0b1001010;
		System.out.println(binary);
		
		
		//represent  hexadecimal
		int hexa=0x3842af;
		System.out.println(hexa);
		
		
		//int to octal
		int octal=012763;
		System.out.println(octal);
		
	}
}
