package dailyassignments;

public class Prog7_Prime {
	public static void main(String[] args) {
		//27_03_2026_Assignment
		
		        int num = 21;  

		        int count = 0;

		        if (num <= 1) {
		            System.out.println(num + " is not prime");
		        } else {
		            for (int i = 2; i < num; i++) {
		                if (num % i == 0) {
		                    count++;
		                    break;
		                }
		            }

		            if (count == 0) {
		                System.out.println(num + " is prime");
		            } else {
		                System.out.println(num + " is not prime");
		            }
		        
		    }
	}

}
