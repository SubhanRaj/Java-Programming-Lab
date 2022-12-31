// Java program to demonstrate the difference between method overloading and overriding.

package methodOverloadingOverriding;

class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    // Overridden method
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    // Method overloading
    public void move(String destination) {
        System.out.println("Car is moving to " + destination);
    }
}

public class methodOverloadingOverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Car car = new Car();
        car.move();
        car.move("Paris");
    }
}
