package dailyassignments;

public class Prog23_SumNumbersInString {
	 public static void main(String[] args) {
		 //22_04_2026_Assignment
	        String str = "ab12cd34";
	        int sum = 0;
	        String num = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isDigit(ch)) {
	                num = num + ch;   // build number
	            } else {
	                if (!num.equals("")) {
	                    sum = sum + Integer.parseInt(num);
	                    num = "";
	                }
	            }
	        }

	        // for last number if string ends with digit
	        if (!num.equals("")) {
	            sum = sum + Integer.parseInt(num);
	        }

	        System.out.println("Sum = " + sum);
	    }
}
