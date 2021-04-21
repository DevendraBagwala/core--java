package Assignment3;
/* 
 * this class has a method that perform exceptionHandling
 */

import java.io.IOException;
public class TestExceptionchain {

	void m() throws IOException{  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(IOException e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
	   TestExceptionchain obj=new TestExceptionchain();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}
