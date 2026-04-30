package dailyassignments;

public class Prog27_Regex {
	public static void main(String[] args) {
		//28_04_2026_Assignment
		
		String productCode[]={"AB123X","XY999Z"};
				
		String regex1="^[A-Z]{2}\\d{3}[XZ]$";
		//1. Product Code Validation
		for(String code:productCode) {
		if(code.matches(regex1)) {
		System.out.println(code+": Valid Product Code");
		}
		else
		System.out.println(code+": Invalid Product Code");
		}
		

		String productCode3="A123X";
		if(productCode3.matches(regex1))
			System.out.println(productCode3+": Valid Product Code");
		else
		System.out.println(productCode3+": Invalid Product Code");
		
		
		//2. Email Username Constraint
		String userName[]={"hello_123","user12","1hello","ab","ab@"};
		
		String regex="^[a-zA-Z][A-Za-z0-9_]{5,12}$";
		for(String user : userName) {
            if(user.matches(regex))
                System.out.println(user + ": Valid");
            else
                System.out.println(user + ": Invalid");
        }
		
		
	}
}
