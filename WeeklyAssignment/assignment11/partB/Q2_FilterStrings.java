package assignment11.partB;

public class Q2_FilterStrings {
	public static void main(String[] args) {
		String[] words= {"Java", "Automation", "API", "Playwright"};
		
		for(String w:words)
		{
			int len=w.length();
			
			if(len>5)
			System.out.println(w);
		}
	}
	
	
}
