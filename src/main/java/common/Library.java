
package common;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Library {
    public static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = Validate.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = Validate.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = Validate.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    public static Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = Validate.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = Validate.checkInputDouble();
        return new Rectangle(width, length);
    }

    public static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = Validate.checkInputDouble();
        return new Circle(radius);
    }

    public static void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        System.out.println("-----Rectangle-----");
        rectangle.printResult();
        System.out.println("-----Circle-----");
        circle.printResult();
        System.out.println("-----Triangle-----");
        trigle.printResult();
    }
}
