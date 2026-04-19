package dailyassignments;

public class Prog15_FirstNonRepeatingElement {
	
public static void main(String[] args) {
	// 09_04_2026_Assignment
	int[] arr = {4, 5, 1, 2, 0, 4};
	//int arr[]= {1,1,2,2};
    for (int i = 0; i < arr.length; i++) {
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println(arr[i]);
            return; 
        }
    }

    System.out.println("No unique element");
}
}

