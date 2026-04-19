
package dailyassignments;

public class Prog15_LeftRotate {
public static void main(String[] args) {
	//09_04_2026_Assignment
	int a[]= {1,2,3,4};
	//int a[]= {5,2,8,3,9,4};
	int temp=a[0];
	
	for(int i=0;i<a.length-1;i++){
			a[i]=a[i+1];
	}
	a[a.length-1]=temp;
	
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
			
}
}
