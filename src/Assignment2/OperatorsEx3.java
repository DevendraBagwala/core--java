package Assignment2;
/* 
 * This class has a method that perform of strictfp
 */
public class OperatorsEx3 {

	//declaration of strict-floating-point method
		public strictfp double sum(){
			
			double num1 = 7.3;
			double num2 = 8.0;
			double sum = num1+num2;
			return sum;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//object creation
			OperatorsEx3 op = new OperatorsEx3();
			double sum = op.sum();
			System.out.println("sum = " + sum);

		}
	
}
