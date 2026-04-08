package assignment4;

public class Program1_Fibonacci {
	public static void main(String[] args) {
		//27_03_2026_Loop_Assignment
		
		int n=10;
		int num1=0;
		int num2=1;
		int next;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int i=0;i<n;i++)
		{
			next=num1+num2;
			System.out.print(next+" ");
			num1=num2;
			num2=next;
		}
	}

}
