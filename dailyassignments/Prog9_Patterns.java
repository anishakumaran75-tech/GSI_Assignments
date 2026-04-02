package dailyassignments;

public class Prog9_Patterns {
public static void main(String[] args) {
	//31_03_2026_assignment
	
	int num1=5;
	int num2=5;
	
	while(num1>0) {
	for(int i=1;i<=num1;i++) {
			System.out.print("*");
	}
	System.out.println("");
	num1--;
	}
	System.out.println("\n");
	
	for(int n=1;n<=num2;n++) {
		for(int m=1;m<=n;m++)
		{
			System.out.print(""+m);
		}
		System.out.println("");
	}
		
		
}
}

