package dailyassignments;

public class Prog22_TitleCase {
	public static void main(String[] args) {
		//21_04_2026_Assignment Qn2

        String str = "java programming language";
        String words[] = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0,1).toUpperCase();
            String rest = words[i].substring(1).toLowerCase();

            result = result + first + rest + " ";
        }

        System.out.println(result.trim());
    }

}
