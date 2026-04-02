package dailyassignments;
public class Prog4_StudentResultSystem {
public static void main(String[] args) {
	//24_03_2026_assignment
	
	int m1=55;
	int m2=84;
	int m3=43;
	int m4=90;
	int m5=62;
	int total=m1+m2+m3+m4+m5;
	double percentage=total/5.0;
	
	if(m1<33 || m2<33 || m3<33 || m4<33 || m5<33)
		System.out.println("Result = Fail \nGrade = F");
	else
	{
	
		System.out.println("Result = Pass ");
		
		if(percentage>=90)
			System.out.println("Percentage = "+percentage+"\nGrade = A+");
		else  if(percentage>=75)
			System.out.println("Percentage = "+percentage+"\nGrade = A");
		else  if(percentage>=60)
			System.out.println("Percentage = "+percentage+"\nGrade = B");	
		else  if(percentage>=50)
			System.out.println("Percentage = "+percentage+"\nGrade = C");
		else  if(percentage>=33)
			System.out.println("Percentage = "+percentage+"\nGrade = D");
	}
	
}

}

