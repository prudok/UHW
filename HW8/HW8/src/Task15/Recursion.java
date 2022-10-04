package Task15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion {
    List<Integer> numbersOfValue = new ArrayList<>();

    public List<Integer> answer(int startValue) {
        if(startValue == 0) {
            return numbersOfValue;
        }
        numbersOfValue.add(startValue % 10);
        answer(startValue /= 10);
        return numbersOfValue;
    }
}
