package Task1;

public class Main {
    public static void main(String[] args) {
        float[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float sum = 0;
        for (float ind : array) {
            sum += ind;
        }
        System.out.println("The sum is: " + (int) sum);
        System.out.println("The average is: " + sum / 10);
    }
}