package Task2;

public class Circle extends Point{
    public double radius;

    public Circle(Point point, double radius) {
        super(point.x, point.y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Position x: " + String.format("%.3f", x) + ", position y: " + String.format("%.3f", y) + ", radius: " + String.format("%.3f", calculateArea()) + ". \n";
    }
}
