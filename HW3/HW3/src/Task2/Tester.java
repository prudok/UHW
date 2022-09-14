package Task2;

public class Tester {
    public Circle[] circles;
    int size;

    public Tester(Circle[] circles) {
        this.circles = circles;
    }

    public Tester(int size) {
        this.size = size;
        circles = new Circle[size];
        for(int ind = 0; ind < size; ++ind) {
            circles[ind] = new Circle(new Point(Math.random()  * 10, Math.random() * 10), Math.random() * 10);
        }
    }

    @Override
    public String toString() {
        String answer = "";
        for(Circle ind : circles) {
            answer += ind.toString();
        }
        return answer;
    }
}
