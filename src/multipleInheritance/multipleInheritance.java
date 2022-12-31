// Java Program to demonstrate the concept of multiple inheritance
package multipleInheritance;

interface Shape {
    double getArea();
}

interface Color {
    String getColor();
}

class Square implements Shape, Color {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Square square = new Square(5, "red");
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Color of square: " + square.getColor());
    }
}

