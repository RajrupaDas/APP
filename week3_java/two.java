//rectangle
public class Rectangle {
    double width;
    double height;
    void setDimensions(double w, double h) {
        width = w;
        height = h;
    }
    double calculateArea() {
        return width * height;
    }
    double calculatePerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(5.5, 3.0);
        System.out.println("Rectangle Dimensions:");
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

