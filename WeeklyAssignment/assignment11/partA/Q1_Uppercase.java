package assignment11.partA;

interface Uppercase{
	public String convert(String str);
}
class Convert implements Uppercase
{
	public String convert(String str)
	{
		return str.toUpperCase();
		
	}
}
public class Q1_Uppercase {
	public static void main(String[] args) {
		Convert obj= new Convert();
		String input="hello world";
		String output= obj.convert(input);
		
		System.out.println("Input: "+input);
		System.out.println("Output: "+output);
		
	}

}
