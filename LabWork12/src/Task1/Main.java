package Task1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        String[] regData = inputData.split(" ");

        System.out.print("Your words: " + Arrays.toString(regData));
    }
}