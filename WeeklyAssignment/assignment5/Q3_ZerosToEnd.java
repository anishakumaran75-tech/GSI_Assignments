package assignment5;

public class Q3_ZerosToEnd {
public static void main(String[] args) {
	int[] num= {1,0,3,0,5};
	
	moveZerosToEnd(num);
	for(int i=0;i< num.length;i++) {
		System.out.print(num[i]+" ");
	}
	
}

	static void moveZerosToEnd(int arr[]) {
		int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index]=arr[i];
			index++;
		}
		
	}
	
	while(index < arr.length)
	{
		arr[index]=0;
		index++;
	}
	}
	

}
