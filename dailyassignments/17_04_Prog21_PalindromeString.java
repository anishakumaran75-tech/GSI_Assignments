package dailyassignments;

public class Prog21_PalindromeString {
	public static void main(String[] args) {
		//		17_04_2026_Assignment
        String str = "racecar";
        String rev = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
