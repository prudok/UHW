package Task1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter amount of cities: ");
        int size = userInput.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0;

        for (int ind = 0; ind < size; ++ind) {
            for (int jnd = 0; jnd < size; ++jnd) {
                matrix[ind][jnd] = userInput.nextInt();
                if (!isCorrectInput(matrix[ind][jnd])) {
                    System.out.println("Incorrect value. try again.");
                    exit(0);
                }
            }
        }

        for (int ind = 0; ind < size; ++ind) {
            for (int jnd = 0; jnd < size; ++jnd) {
                sum += matrix[ind][jnd];
            }
        }
        System.out.println("The answer is: " + sum / 2);
    }

    public static boolean isCorrectInput(int value) {
        return value == 0 || value == 1;
    }
}