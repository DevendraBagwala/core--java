package Assignment1;

public class ArrayExample2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emptyArray[] = new int[0];
		 
        //will print 0, if length of array is printed
        System.out.println(emptyArray.length); 
 
        //will throw  java.lang.ArrayIndexOutOfBoundsException exception
        //emptyArray[0] = 1;
        
        for (int i : emptyArray) {

			System.out.println(i);
		}
        
        for (int i = 0;  i<=(emptyArray.length); i++) {

        		System.out.println(emptyArray[i]);
		}



	}

}
