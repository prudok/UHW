package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthorTime authorTime = new AuthorTime();
        System.out.println("Enter second name of author: ");
        Scanner scanner = new Scanner(System.in);
        authorTime.setAuthorSecondName(scanner.next());
        System.out.println(authorTime);
    }
}