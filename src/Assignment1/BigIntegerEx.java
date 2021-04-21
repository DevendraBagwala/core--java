package Assignment1;


import java.math.BigInteger;
public class BigIntegerEx {

	public static void main(String[] args) {

		// convert long to BigInteger by using static method valueOf
		BigInteger bi = BigInteger.valueOf(1234567890123456789L);
		System.out.println(bi);

		// arithmetic operations on BigInteger
		BigInteger bi1 = new BigInteger("1234567890");
		BigInteger bi2 = new BigInteger("1234567890123");

		BigInteger sum = bi1.add(bi2);
		System.out.println(sum);
		BigInteger difference = bi1.subtract(bi1);
		System.out.println(difference);
		BigInteger quotient = bi1.divide(bi2);
		System.out.println(quotient);
		BigInteger product = bi1.multiply(bi2);
		System.out.println(product);

	}
}
