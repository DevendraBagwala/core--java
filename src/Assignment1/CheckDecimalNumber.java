package Assignment1;

import java.math.BigDecimal;
public class CheckDecimalNumber {

public static void main(String args[]){
		
		// by using double or float there is some minor change in result
		double difference = 10.0 - 9.2;
		System.out.println(difference);
		
		// by using BigDecimal there is no change in result
		BigDecimal bd1 = new BigDecimal("10.0");
		BigDecimal bd2 = new BigDecimal("9.2");
		BigDecimal difference1 = bd1.subtract(bd2);
		System.out.println(difference1);
		
	}
}
