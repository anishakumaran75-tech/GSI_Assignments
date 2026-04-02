package assignment3;

public class Program1_ASCII {
	public static void main(String[] args) {

	    char ch = 'A';

	    int ascii = (int) ch;
	    System.out.println("ASCII value: " + ascii);

	    int newAscii = ascii + 5;
	    System.out.println("New ASCII value: "+ newAscii);

	    char newChar = (char) newAscii;
	    System.out.println("New character: " + newChar);

		}
}
