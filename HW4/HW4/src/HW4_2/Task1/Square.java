package HW4_2.Task1;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape: " + getType() + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }

    @Override
    String getType() {
        return "Square";
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}
