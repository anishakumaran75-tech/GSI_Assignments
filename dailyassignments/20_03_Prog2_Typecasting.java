package dailyassignments;

public class Prog2_Typecasting {
	public static void main(String[] args) {
		//20_3_2026_typecasting
		
		float marks=97.8f;
		
		//upcasting
		double doubleMark= marks;
		//downcasting
		int intMark= (int)marks;
		
		char value= (char)intMark;
		
		System.out.println("Float value: "+marks);
		System.out.println("Converted to double: "+doubleMark);
		System.out.println("Converted to int: "+intMark);
		System.out.println("Character value: "+value);
		
		System.out.println("\nASCII "+intMark+" = '"+value+"'");
	}

}
