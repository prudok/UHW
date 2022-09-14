package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2
        Scanner userInput = new Scanner(System.in);
        int[] userArray = new int[5];
        try {
            for(int ind = 0; ind < userArray.length; ++ind) {
                userArray[ind] = userInput.nextInt();
            }
        } catch (Exception error) {
            System.out.println("Error: " + error);
        }
        System.out.println("The minimum number of userArray is: " + minOrMaxNumber(userArray, "min"));
        System.out.println("The maximum number of userArray is: " + minOrMaxNumber(userArray, "max"));
    }
    public static int minOrMaxNumber(int[] checkArray, String choice) {
        int minOrMax = checkArray[0];
        if(choice == "min") { for(int ind : checkArray) if(ind < minOrMax) minOrMax = ind; return minOrMax; }
        else if(choice == "max") { for(int ind : checkArray) if(ind > minOrMax) minOrMax = ind; return minOrMax; }
        return 0;
    }
}