package Task1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        double[] randData = new double[5];

        for(int ind = 0; ind < 5; ++ind)
            randData[ind] = rand.nextDouble() * 100;

        for(int ind = 0; ind < randData.length; ++ind)
            System.out.println(String.format("%.3f", randData[ind]));
    }
}