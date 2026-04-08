package assignment3;

public class Program2_StudentMarkConversion {
	public static void main(String[] args) {
        float marks = 87.6f;

        // Convert float to double
        double doubleMarks = marks;

        // Convert float to integer 
        int intMarks = (int) marks;

        System.out.println("Float value: " + marks);
        System.out.println("Double value: " + doubleMarks);
        System.out.println("Integer value: " + intMarks);

        char ch = (char) intMarks;
        System.out.println("Character value: " + ch);
    }

}
