//using method
public class Car {
    String model;
    int year;
    String color;
    void setCarDetails(String model, int year, String color) {
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
        Car car1 = new Car();
        car1.setCarDetails("Hyundai i20", 2021, "White");
        Car car2 = new Car();
        car2.setCarDetails("Maruti Swift", 2020, "Black");
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}


