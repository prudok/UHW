package HW4_2.Task7;

public class Student extends Learner{

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, String surname, int age, double grade) {
        super(name, surname, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        String answer = super.toString();
        answer += ", grade: " + getGrade();
        return answer;
    }
}
