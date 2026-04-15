package dailyassignments;

public class Prog8_PerfectNumber {
public static void main(String[] args) {
	//30_03_2026_Assignment
	int n=28;
	int sum=0;
	
	for (int i=1;i<=n-1;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
	
	if(sum==n)
		System.out.println("It's a Perfect Number");
	else
		System.out.println("It's a Not Perfect Number");
		
}
}
