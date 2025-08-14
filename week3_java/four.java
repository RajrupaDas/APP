//car info
public class Car {
    String model;
    int year;
    String color;

    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }

    public static void main(String[] args) {
        Car car1 = new Car("Hyundai i20", 2021, "White");
        Car car2 = new Car("Maruti Swift", 2020, "Black");

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}

