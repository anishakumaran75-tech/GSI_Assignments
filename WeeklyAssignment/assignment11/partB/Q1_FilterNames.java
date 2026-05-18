package assignment11.partB;

public class Q1_FilterNames {
	public static void main(String[] args) {
			String[] names= {"Aman","Prasha","Anisha","Mohan","Riya","Tushar"};
			for(String name:names) {
				char lastchar=name.charAt(name.length()-1);
				
				if(lastchar=='a' || lastchar=='A') {
					System.out.println(name);
				}
    
        }
    }
}
