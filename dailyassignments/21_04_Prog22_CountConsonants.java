package dailyassignments;

public class Prog22_CountConsonants {
	 public static void main(String[] args) {
		 //21_04_2026_Assignment Qn1
	        String str = "Hello World";
	        int count = 0;

	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
	                    count++;
	                }
	            }
	        }
	        System.out.println("Consonants = " + count);
	    }
}
