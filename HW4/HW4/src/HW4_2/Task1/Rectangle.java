package HW4_2.Task1;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return "Shape: " + getType() + ", "+ "area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
