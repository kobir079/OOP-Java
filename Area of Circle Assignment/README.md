import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius for circle1: ");
        double r1 = sc.nextDouble();
        Circle circle1 = new Circle(r1);
        System.out.println("Area of circle1: " + circle1.calculateArea());

        System.out.print("Enter radius for circle2: ");
        double r2 = sc.nextDouble();
        Circle circle2 = new Circle(0);
        circle2.setRadius(r2);
        System.out.println("Area of circle2: " + circle2.calculateArea());

        sc.close();
    }
}
