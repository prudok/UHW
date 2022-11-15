package Task1;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(theMethod(array)));

    }

    public static int[] theMethod(int[] array) {
        Stack<Integer> stack = new Stack<Integer>();
        Iterator iterator = stack.iterator();

        for (int ind = 0; ind < array.length; ++ind) {
            stack.push(Integer.valueOf(array[ind]));
        }

        int temp = 0;
        for (int ind = 0; ind < array.length / 2; ++ind) {
            System.out.println("Array reverse -> " + Arrays.toString(array));
            temp = array[ind];
            array[ind] = stack.peek();
            stack.pop();
            array[(array.length - 1) - ind] = temp;
        }
        return array;
    }
}
