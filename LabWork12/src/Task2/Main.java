package Task2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        System.out.println(inputData.matches("abcdefghijklmnopqrstuv18340"));
    }
}