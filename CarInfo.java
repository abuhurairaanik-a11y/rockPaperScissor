 class Car {
    String color;
    String brand;
    String registrationNumber;
    int registrationYear;

    // Constructor
    Car(String color, String brand, String registrationNumber, int registrationYear) {
        this.color = color;
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.registrationYear = registrationYear;
    }

    // Display method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Year: " + registrationYear);
        System.out.println("---------------------------");
    }
}

public class CarInfo {
    public static void main(String[] args) {
        // Create two car objects
        Car car1 = new Car("Red", "Toyota", "DHA-1234", 2022);
        Car car2 = new Car("Black", "BMW", "CTG-5678", 2023);

        // Display their information
        System.out.println("Car Details:");
        car1.displayInfo();
        car2.displayInfo();
    }
}
    
