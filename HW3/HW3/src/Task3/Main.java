package Task3;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double[] randArray = new double[5];
        int diff = 99 - 10;
        Random rand = new Random();
        for(int ind = 0; ind < randArray.length; ++ind) {
            randArray[ind] = rand.nextDouble(diff + 1);
            randArray[ind] += 10;
        }
        for(double ind : randArray) {
            System.out.print(ind + " ");
        }
        if(isCorrect(randArray)) System.out.println("Each element is larger than the previous one.");
        else System.out.println("Each element is not greater than the previous one.");

    }
    public static boolean isCorrect(double[] checkArray) {
        for(int ind = 1; ind < checkArray.length; ++ind) {
            if(checkArray[ind] < checkArray[ind - 1]) return false;
        }
        return true;
    }
}