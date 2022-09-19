package HW4_2.AbstractTask8;

import HW4_2.Task1.Tester;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(13, "red", true), new Rectangle(13, 4, "yellow", false), new Square(9)};
        for(Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}