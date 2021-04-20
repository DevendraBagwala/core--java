package Assignment1;

public class Exception {
	

	

		public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		   //rest code of the program   
		   System.out.println(" The code is working");  
		   
		  try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	   	  
		  
 }
}		  
		

