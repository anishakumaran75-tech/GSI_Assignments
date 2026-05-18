package assignment11.partA;

import java.util.Scanner;

interface Vowel 
{
	public int countVowel(String str);
}
class CountVowel implements Vowel
{
	public int countVowel(String str)
	{
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=	Character.toLowerCase(str.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u')
			{
                    count++;
            }
		}
		return count;
	}
}
public class Q3_CountVowel {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		CountVowel obj=new CountVowel();
		System.out.println("Input: ");
		String input=sc.next();
		int result=obj.countVowel(input);
		
		
		System.out.println("Output: "+result);
	}
}
