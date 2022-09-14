package Task2;

public class Main {
    public static void main(String[] args) {
        Ball testBall = new TestBall(1, 1);
        System.out.println(testBall);
        testBall.move(-0.5, 5.6);
        System.out.println(testBall);
    }
}