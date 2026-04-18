package assignment5;

public class Q1_SecondSmallestElement {
	public static void main(String[] args) {
		int[] arr= {4,2,7,2,9,1};
		int small=arr[0];
		int secondSmall=small;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small)
				small=arr[i];
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=small && arr[i]<secondSmall) {
				secondSmall=arr[i];
			}
		}
		System.out.println(secondSmall);
	}

}
