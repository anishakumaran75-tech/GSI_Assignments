package dailyassignments;

interface Payment {
    void pay(double amount);
}


class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹ " + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹ " + amount + " using UPI");
    }
}

// Main class
public class Prog25_SimplePaymentSystem {
    public static void main(String[] args) {
    	//24_04_2026_Assignment
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(500);
        p2.pay(1000);
    }
}
