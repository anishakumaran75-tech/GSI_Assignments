package assignment4;

public class Program2_PrimeFactorOfNumber {
public static void main(String[] args) {
	//27_03_2026_Loop_Assignment
	
       int n=60;
       
       for(int i=2;i<=n/2;i++) {
    	   if(i>n/2) {
    		   break;
    	   }
    	   if(n%i==0)
    	   {
    		   int count=0;
    		   for(int j=1;j<=i;j++)
    		   {
    			   if(i%j==0)
    			   {
    				   count++;
    			   }
    		   }
    		   if(count==2) {
    			   System.out.print(i+" ");
    		   }
    	   }
       }

}
}
