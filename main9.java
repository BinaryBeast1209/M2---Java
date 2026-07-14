class Shape {

    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Circle(3);

        System.out.println("Area of Rectangle: " + shapes[0].calculateArea());
        System.out.println("Area of Circle: " + shapes[1].calculateArea());
    }
}
