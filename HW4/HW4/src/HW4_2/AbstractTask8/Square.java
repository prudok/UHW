package HW4_2.AbstractTask8;

public class Square extends Rectangle {

    private double side;

    public Square() {
        side = 0;
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + ", color: " + getColor() + ", perimeter: " +
                + getPerimeter();
    }
}
