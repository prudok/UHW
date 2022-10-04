package Task7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


public class Recursion {
    private List<Integer> primeValues = new ArrayList<Integer>();
    public static boolean isPrime(final int number) {
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }


    public List<Integer> answer(int startValue){
        if(startValue < 1 || startValue == 1) {
            Collections.reverse(primeValues);
            return primeValues;
        }
        if(isPrime(startValue)) {
            primeValues.add(startValue);
        }
        answer(startValue - 1);
        return primeValues;
    }
}
