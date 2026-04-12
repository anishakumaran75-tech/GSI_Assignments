package assignment5;

public class Q2_Sorted {
	
 static boolean isSorted(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1])
			return false;
	}
	return true;
}
public static void main(String[] args) {
	int[] arr1= {1,2,3,4};
	int[] arr2= {1,3,2};
	
	System.out.println("Array 1 isSorted :"+isSorted(arr1));
	System.out.println("Array 2 isSorted :"+isSorted(arr2));
}
}
