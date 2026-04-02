package assignment4;

public class Program3_DigitTransformationLogic {
public static void main(String[] args) {
	//27_03_2026_Loop_Assignment
	
	int n=57243;
	int digit=0;
	int pos=1,multiplier=1,result=0;
	while(n>0) {
		digit=n%10;
		
		if(pos%2!=0 && digit<=4) {
				digit=digit*2;
		}
		else if(pos%2==0) {
			digit=1;
		}
		
		result=result+(digit*multiplier);
		multiplier=multiplier*10;
		
		
	n=n/10;
	pos++;
	}
	System.out.println(result);
}
}
