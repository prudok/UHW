package Task3;

public class Main {
    public static void main(String[] args) {
        Point randomPoint = new Point(10, 10);
        Circle circle = new Circle(randomPoint, 6);
        System.out.println(circle);
        System.out.println(circle.calculateArea());
        Circle[] circlesArray = {new Circle(new Point(10, 5), 1), new Circle(new Point(2, 10), 7) };
        Tester tester = new Tester(2, circlesArray);
        System.out.println(tester);
    }
}