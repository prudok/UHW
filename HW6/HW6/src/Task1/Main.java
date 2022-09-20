package Task1;

public class Main {
    public static void main(String[] args) {
        //1
        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 10);
        System.out.println("First circle position: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Second circle position: " + circle);
        //2
        MovableRectangle rectangle = new MovableRectangle(1,1,0, 0, 2, 2);
        System.out.println("First position of rectangle: " + rectangle);
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println("Secon position of rectangle: " + rectangle);
    }
}