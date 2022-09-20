package Task1;

public class MovableCircle extends MovablePoint{

    private int radius;
    private MovablePoint center;

    public MovableCircle() {
        radius = 0;
        center = new MovablePoint();
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveRight() {
        center.moveRight();
    }
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "x: " + center.getX() + ", y: " + center.getY();
    }
}
