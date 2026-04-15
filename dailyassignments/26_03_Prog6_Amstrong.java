package dailyassignments;

public class Prog6_Amstrong {
	public static void main(String[] args) {
		//		26_03_2026_Assignment
		
		
		int num = 153, sum = 0, temp;

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit); 
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
		
			
	}

}
