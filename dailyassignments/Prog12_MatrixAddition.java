package dailyassignments;

public class Prog12_MatrixAddition {
public static void main(String[] args) {
	//	03_04_2026_Assignment
	
	int[][] A= {
			{1,2,3,4},
			{5,6,7,8},
			{9,1,2,3}
			};
	int[][] B= {
			{4,3,2,1},
			{8,7,6,5},
			{3,2,1,0}
				
	};
	
	int[][] result = new int[3][4];
    int max = result[0][0];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            result[i][j] = A[i][j] + B[i][j];

            if (i == 0 && j == 0) {
            } else if (result[i][j] > max) {
                max = result[i][j];
            }
        }
    }
    
    System.out.println("Result Matrix:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Maximum Element: " + max);

}
}
