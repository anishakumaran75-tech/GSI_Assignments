package assignment8;

abstract class Payment
{
	int amount;
	Payment(int amount) {
		this.amount=amount;
	}
	abstract void makePayment();
	void paymentDetails()
	{
		System.out.println("Payment Amount: "+amount);
	}
}
class CreditCardPayment extends Payment
{
	String cardNum;
	
	CreditCardPayment(int amount,String cardNum)
	{
		super(amount);
		this.cardNum=cardNum;
	}
	void makePayment()
	{
		System.out.println("Paid"+amount+"using Credit Card ending with"+ cardNum);
	
	}
}

class UPIPayment extends Payment
{
	String upiId;
	UPIPayment(int amount,String upiId) {
		super(amount);
		this.upiId=upiId;
		
	}
	
	void makePayment()
	{
		System.out.println("Paid"+amount+"using UPI ID: "+ upiId);

	}
}

public class Q2_AbstractClass {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment(5000, "987651234");
        p1.paymentDetails();
        p1.makePayment();

        System.out.println();

        Payment p2 = new UPIPayment(1500, "user@upi");
        p2.paymentDetails();
        p2.makePayment();
	}

}
