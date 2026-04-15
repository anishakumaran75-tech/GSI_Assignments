package dailyassignments;

public class Prog11_AreaCalculator {
	//02_04_2026_Assignment
	
	static double area(double radius) {
		double pi=3.14;
		double  value=pi*radius*radius;
		return value;		
	}
	
	static int area(int length,int breath) {
		int value=length*breath;
		return value;
	}
	
	static int area(int side) {
		int value=side*side;
		return value;
	}
public static void main(String[] args) {
	System.out.println("Circle Area : "+(area(5.6)));
	System.out.println("Rectangle Area :"+(area(5,8)));
	System.out.println("Square Area : "+(area(5)));
	
	
}
}
