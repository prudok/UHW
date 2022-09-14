package Task3;

public class Circle {

    private Point cPoint;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(Point cPoint, double radius) {
        this.cPoint = cPoint;
        this.radius = radius;
    }

    public void setPoint(double x, double y) {
        cPoint.setX(x);
        cPoint.setY(y);
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "X: " + cPoint.getX() + ", Y: " + cPoint.getY() + ", Area of Cirlce: " + String.valueOf(calculateArea()) + ". ";
    }
}
