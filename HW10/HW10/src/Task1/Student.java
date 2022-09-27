package Task1;
import java.util.Random;
public class Student {

    private String name;
    private String secondName;
    private String work;
    private int groupNumber;
    private double ball;
    static Random rand = new Random();
    public static String randString(int numberOfLetters) {
        String output = "";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] upperChars = upper.toCharArray();
        for(int ind = 0; ind < numberOfLetters; ++ind) {
            output += upperChars[Math.abs(rand.nextInt() % 26)];
        }
        return output;
    }
    public Student(String name, String secondName, String work, int groupNumber) {
        this.name = name;
        this.secondName = secondName;
        this.work = work;
        this.groupNumber = groupNumber;
    }

    public Student() {
        name = randString(4);
        secondName  = randString(7);
        work = randString(5);
        groupNumber = rand.nextInt() % 20;
        ball = rand.nextDouble() % 5;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getBall() {
        return ball;
    }
    public void setBall(double ball) {
        this.ball = ball;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", second name: " + getSecondName() + ", work: " + getWork() +
                ", group number: " + getGroupNumber();
    }

}
