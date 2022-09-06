import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        float[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float sum = 0;
        for(float ind : array) { sum += ind; };
        System.out.println("The sum is: " + (int)sum);
        System.out.println("The average is: " + sum / 10);
        //2
        Scanner userInput = new Scanner(System.in);
        int[] userArray = new int[5];
        /*try {
            for(int ind = 0; ind < userArray.length; ++ind) {
                userArray[ind] = userInput.nextInt();
            }
        } catch (Exception error) {
            System.out.println("Error: " + error);
        }*/
        System.out.println("The minimum number of userArray is: " + minOrMaxNumber(userArray, "min"));
        System.out.println("The maximum number of userArray is: " + minOrMaxNumber(userArray, "max"));
        //3
        //4
        for(float ind = 1; ind <= 10; ++ind) {
            float answer = 1/ind;
            System.out.format("%.3f%n", answer);
        }
        //5
        Factorial three = new Factorial(7);
        System.out.println(three.calculateFactorial());
    }
    public static int minOrMaxNumber(int[] checkArray, String choice) {
        int minOrMax = checkArray[0];
        if(choice == "min") { for(int ind : checkArray) if(ind < minOrMax) minOrMax = ind; return minOrMax; }
        else if(choice == "max") { for(int ind : checkArray) if(ind > minOrMax) minOrMax = ind; return minOrMax; }
        return 0;
    }
}