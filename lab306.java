import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;


    public Rectangle() {
        this.length = 2;
        this.breadth = 3;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class lab306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        Rectangle rectangle2 = new Rectangle(length, breadth);

        scanner.close();

        System.out.println("Area of rectangle with default values: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle with user input values: " + rectangle2.calculateArea());
    }
}
