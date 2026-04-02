package dailyassignments;

public class MultipleOfTwoandFive {
	//25_03_2026_Assignment
	
	public static void main(String[] args) {
		int i=1;
		while(i<=50) {
			if (i%2==0 && i%5==0) 
				System.out.println(i*i);
			else if(i%2==0)
				System.out.println(i*i*i);
			else if(i%5==0)
				System.out.println(i*5);
			else
				System.out.println(i);
			
			i++;
		}
		
	}

}
