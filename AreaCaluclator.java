import java.util.Scanner;

class AreaCalculator {
    // Constructor for the Circle class
    class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Constructor for the Square class
    class Square {
        double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return side * side;
        }
    }

    // Constructor for the Rectangle class
    class Rectangle {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }
    }

    // Constructor for the Cone class
    class Cone {
        double radius;
        double height;

        public Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        public double getArea() {
            double slantHeight = Math.sqrt(radius * radius + height * height);
            return Math.PI * radius * (radius + slantHeight);
        }

        public double getVolume() {
            return Math.PI * radius * radius * height / 3;
        }
    }

    // Constructor for the Triangle class
    class Triangle {
        double base;
        double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double getArea() {
            return 0.5 * base * height;
        }
    }
}

public class AreaCaluclator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        AreaCalculator.Circle circle = new AreaCalculator().new Circle(scanner.nextDouble());
        System.out.println("Area of the circle: " + circle.getArea());

        System.out.println("Enter the side length of the square:");
        AreaCalculator.Square square = new AreaCalculator().new Square(scanner.nextDouble());
        System.out.println("Area of the square: " + square.getArea());

        System.out.println("Enter the length and width of the rectangle:");
        AreaCalculator.Rectangle rectangle = new AreaCalculator().new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        System.out.println("Enter the radius and height of the cone:");
        AreaCalculator.Cone cone = new AreaCalculator().new Cone(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of the cone: " + cone.getArea());
        System.out.println("Volume of the cone: " + cone.getVolume());

        System.out.println("Enter the base and height of the triangle:");
        AreaCalculator.Triangle triangle = new AreaCalculator().new Triangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of the triangle: " + triangle.getArea());
        scanner.close();
    }
    
}