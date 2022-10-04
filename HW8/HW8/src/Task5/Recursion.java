package Task5;

public class Recursion {
    private int sum = 0;
    public int sumOfNumber(int value) {
        if(value == 0) return sum;
        sum += value % 10;
        sumOfNumber(value /= 10);
        return sum;
    }
}
