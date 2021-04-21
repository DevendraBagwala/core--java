package Assignment1;

//program to signed values to unsigned values
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// convert signed byte to unsigned byte
		byte num1 = -23;
		System.out.println("signed byte value = " + num1);
		System.out.println("unsigned byte value = " + Byte.toUnsignedInt(num1));
		
		// convert signed short to unsigned short
		short num2 = -23093;
		System.out.println("signed short value = " + num2);
		System.out.println("unsigned short value = " + Short.toUnsignedInt(num2));
		
		// convert signed int to unsigned int
		int num3 = -347388;
		System.out.println("signed integer value = " + num3);
		System.out.println("unsigned integer value = " + Integer.toUnsignedLong(num3));
		
		// convert signed long to unsigned long
		long num4 = -123l;
		System.out.println("signed long value = " + num4);
		System.out.println("unsigned long value = " + Long.toUnsignedString(num4));
		
		

	}

}
