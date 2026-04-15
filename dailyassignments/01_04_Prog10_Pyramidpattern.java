package dailyassignments;

public class Prog10_Pyramidpattern {
	//01_04_2026_Assignment

	public static void printNumberPyramid(int n) {
		for(int r=1;r<=n;r++)

		{

			for(int sp=1;sp<=n-r;sp++) {
				System.out.print(" ");
			}

			 for(int value=1;value<=r;value++) {
				 System.out.print(value);
			 }
			 for(int value=r-1;value>=1;value--) {
				 System.out.print(value);
			 }
			 System.out.println();

		}
	}
	public static void main(String[] args) {
		int num=5;
		printNumberPyramid(num);
	}
}
