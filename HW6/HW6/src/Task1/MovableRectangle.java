package Task1;

public class MovableRectangle extends MovablePoint{

    private MovablePoint bottomRight;
    private MovablePoint topLeft;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public boolean checkSpeed() {
        if(topLeft.getxSpeed() != bottomRight.getxSpeed()) return false;
        if(topLeft.getySpeed() != bottomRight.getySpeed()) return false;
        return true;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public void moveUp() {
        if(checkSpeed()) {
            bottomRight.moveUp();
            topLeft.moveUp();
        }
    }
    public void moveDown() {
        if(checkSpeed()) {
            bottomRight.moveDown();
            topLeft.moveDown();
        }
    }
    public void moveRight() {
        if(checkSpeed()) {
            bottomRight.moveRight();
            topLeft.moveRight();
        }
    }
    public void moveLeft() {
        if(checkSpeed()) {
            bottomRight.moveLeft();
            topLeft.moveLeft();
        }
    }

    @Override
    public String toString() {
        return "Bottom Right point x: " + bottomRight.getX() + ", y: " + bottomRight.getY() + ", top left point x: " + topLeft.getX() +
                ", y: " + topLeft.getY() + ".";
    }
}
