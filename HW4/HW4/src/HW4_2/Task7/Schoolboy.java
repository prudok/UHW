package HW4_2.Task7;

public class Schoolboy extends Learner{

    private double ball;

    public double getBall() {
        return ball;
    }

    public void setBall(double ball) {
        this.ball = ball;
    }

    public Schoolboy(String name, String surname, int age, double ball) {
        super(name, surname, age);
        this.ball = ball;
    }
    @Override
    public String toString() {
        String answer = super.toString();
        answer += ", ball: " + getBall();
        return answer;
    }
}
