package dailyassignments;

public class Prog8_Factorial {
	public static void main(String[] args) {
		//30_03_2026_Assignment_Factorial
		
		int num=7;
		int result=1;
		
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		System.out.println("Factorial is "+result);
	}

}
