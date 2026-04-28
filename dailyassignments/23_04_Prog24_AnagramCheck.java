package dailyassignments;
import java.util.Arrays;
public class Prog24_AnagramCheck {
	public static void main(String[] args) {
		//23_04_2026_Assignment
        
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        
        if (Arrays.equals(a, b)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }
    }
}
