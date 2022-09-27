package Task1;
import java.util.Random;

public class Student {

    public static Random rand = new Random();
    public static int amount = 0;
    private int IDnumber;

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public Student() {
        IDnumber = Math.abs(rand.nextInt() % 50);
        ++amount;
    }

    @Override
    public String toString() {
        return "My current ID: " + getIDnumber();
    }
}
