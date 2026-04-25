package assignment8;

public class Q1_LongestCommonPrefix {
	public static void main(String[] args) {

        //String[] arr = {"flower", "flow", "flight"};
        //String[] arr = {"dog", "racecar", "car"};
        String[] arr = {"interview", "internet", "internal", "interval"};

        String prefix = arr[0];   

        for (int i = 1; i < arr.length; i++) {

            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    break;
                }
            }
        }

        System.out.println("\""+ prefix+"\"");
    }

}
