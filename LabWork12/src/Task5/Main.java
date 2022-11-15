package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z_\\d]{8,}$"));
    }
}
