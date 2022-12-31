// Java program that illustrates an example of abstract class
package abstractClass;

abstract class Shape {
    // Abstract method
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle...");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}
