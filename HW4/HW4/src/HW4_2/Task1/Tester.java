package HW4_2.Task1;

public class Tester {

    private Shape shape;

    public Tester(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape.toString();
    }
}
