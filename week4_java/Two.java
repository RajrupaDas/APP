
// Program demonstrating protected variable access in a subclass

class Vehicle {
    protected int speed;
}

class Car extends Vehicle {
    public void displaySpeed() {
        this.speed = 120;
        System.out.println("Car speed: " + this.speed);
    }
}

public class Two {
    public static void main(String[] args) {
        Car c = new Car();
        c.displaySpeed();
        // The following line would cause a compile-time error:
        // System.out.println("Direct access speed: " + c.speed);
    }
}

