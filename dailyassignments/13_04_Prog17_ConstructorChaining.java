package dailyassignments;

public class Prog17_ConstructorChaining {
	Prog17_ConstructorChaining() {
        System.out.println("A");
    }

	Prog17_ConstructorChaining(int x) {
        this();
        System.out.println("B");
    }

	Prog17_ConstructorChaining(int x, int y) {
        this(x);
        System.out.println("C");
    }
    

	public static void main(String[] args) {
//13_04_2026_Assignment
		
		new Prog17_ConstructorChaining(10,20);
		
		
		
		
//		Calls Test(int x, int y)
//		Inside → this(x) → calls Test(int x)
//		Calls Test(int x)
//		Inside → this() → calls Test()
//		Calls Test()
//		Prints → A
//		Back to Test(int x)
//		Prints → B
//		Back to Test(int x, int y)
//		Prints → C
	}

}
