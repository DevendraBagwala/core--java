package Assignment1;

//Program of Enum and Sample Example
public class EnumExample {
	
	//declaration of ENUM
	public enum Directions{
		EAST,WEST,NORTH,SOUTH;	
	}
	
	public static void main(String args[]){
		
		//print  ENUM constants
		Directions d = Directions.EAST;
		System.out.println(d);
		
		//printing value of ENUM and index
		System.out.println(Directions.valueOf("WEST"));
		System.out.println(Directions.valueOf("SOUTH").ordinal());
		
	}
	

}