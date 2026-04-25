package assignment7;
class Vehicle {
    String brand;
    int speed;

    static String company = "AutoWorld Ltd";

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    void run() {
        System.out.println("Vehicle is running");
    }

    static void displayCompany() {
        System.out.println("Company: " + company);
    }

    final void engineType() {
        System.out.println("Engine type: Standard Engine");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }

    void run() {
        System.out.println("Car is running smoothly");
    }

    /*
    void engineType() {
        System.out.println("Sports Engine");
    }
    // Error: cannot override final method
    */
}

public class Assignment2 {
    public static void main(String[] args) {

        // Question 1
        Car c1 = new Car("Hyundai", 120, "Petrol");
        c1.display();

        System.out.println();

        // Question 2
        Vehicle v1 = new Vehicle("Bike", 80);
        v1.run();
        c1.run();

        System.out.println();

        // Question 3
        Vehicle.displayCompany();

        System.out.println();

        // Question 4
        c1.engineType();

        System.out.println();

        // Question 5 - String Methods
        String brand = "Hyundai";

        // Reverse
        String rev = "";
        for (int i = brand.length() - 1; i >= 0; i--) {
            rev = rev + brand.charAt(i);
        }
        System.out.println("Reversed: " + rev);

        // Replace vowels with *
        String result = "";

        for (int i = 0; i < brand.length(); i++) {
            char ch = brand.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result = result + "*";
            } else {
                result = result + ch;
            }
        }

        System.out.println("Replaced: " + result);
        

        // Equality check
        System.out.println("Equals Hyundai: " + brand.equals("Hyundai"));
    }
}



