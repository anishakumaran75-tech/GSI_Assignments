package dailyassignments;

public class Prog10_Diamondpattern {
	//01_04_2026_Assignment
	
	public static void printDiamond(int num) {
	for(int r=1;r<=num;r++)

	{

		for(int sp=1;sp<=num-r;sp++)

			System.out.print(" ");

		 for(int star=1;star<=2*r-1;star++)

			 System.out.print("*");

		 System.out.println();

	}

	for(int r=1;r<num;r++)

	{

		for(int sp=1;sp<=r;sp++)

			System.out.print(" ");

		 for(int star=1;star<=2*(num-r)-1;star++)

			 System.out.print("*");

		 System.out.println();

	}
	}

	public static void main(String[] args) {
		int n=6;
		printDiamond(n);

}
}
