package Task6;

public class Circle2 {

    private double radius;

    public Circle2(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateLength() {
        return 2 * Math.PI * radius;
    }

    public static void compareCircles(Circle2 sample1, Circle2 sample2) {
        if(sample1.radius == sample2.radius) System.out.println("no difference");
        else if(sample1.radius > sample2.radius) {
            System.out.println("First circle radius was bigger on " + (sample1.radius - sample2.radius) + " points");
        }
        else System.out.println("Second circle radius was bigger on " + (sample2.radius - sample1.radius) + " points");
    }
}
