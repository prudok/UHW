package Task4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int arraySize = userInput.nextInt();
        int[] array = new int[arraySize];

        for(int ind = 0; ind < array.length; ++ind) {
            int checkInput = userInput.nextInt();
            if(checkInput > arraySize) {
                System.out.println("Error, your number is greater than n.");
                ind = ind < 0 ? 0 : --ind;
            }
            else array[ind] = checkInput;
        }
        int[] evenArray = new int[arraySize];
        int counter = 0;
        for(int ind : array) if(ind % 2 == 0) {
            evenArray[counter] = ind;
            ++counter;
        }
        int[] answer = Arrays.copyOf(evenArray, counter);
        for(int ind : answer) System.out.println(ind);
    }
}