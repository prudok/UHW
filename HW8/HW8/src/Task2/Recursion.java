package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion {
    private List<Integer> nValues = new ArrayList<Integer>();
    public List<Integer> answer(int startValue) {
        if(startValue < 1) {
            Collections.reverse(nValues);
            return nValues;
        }
        nValues.add(startValue);
        answer(startValue - 1);
        return nValues;
    }

}
