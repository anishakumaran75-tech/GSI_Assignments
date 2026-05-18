package assignment11.partA;

interface ReverseString {
    public String reverse(String str);
}
class Reverse implements ReverseString
{
	public String reverse(String str) {
		  String rev = "";

          for (int i = str.length() - 1; i >= 0; i--) {
              rev = rev + str.charAt(i);
          }

          return rev;
	}
}
public class Q2_Reverse {
	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		String val="engineer";
		String rev=reverse.reverse(val);
		
		System.out.println("Input: "+val);
		System.out.println("Output: "+rev);
	
	}
}
