package Task1;

public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        x += xSpeed;
    }
    public void moveDown() {
        x -= xSpeed;
    }
    public void moveRight() {
        y += ySpeed;
    }
    public void moveLeft() {
        y -= ySpeed;
    }

    @Override
    public String toString() {
        return "x : " + getX() + ", y: " + getY() + ".";
    }
}
