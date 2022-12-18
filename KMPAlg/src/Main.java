import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KMPAlg example = new KMPAlg("машина");
        example.matchSample("ведро гараж здоровье машина цветок облако машина пулемашина");

        System.out.print("Enter a sample: ");
        KMPAlg userInput = new KMPAlg(scanner.nextLine());
        System.out.print("Enter a phrase: ");
        userInput.matchSample(scanner.nextLine());
    }
}