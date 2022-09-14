package Task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Dog[] twoDogs = {new Dog("Robert", 2), new Dog("Bobby", 6)};
        DogKennel test = new DogKennel(twoDogs);
        System.out.println(test.toString());
        System.out.println("Would you like to add new dog? Use 'add'. If you want to see all dogs, use 'show'. In order to exit, enter 'exit'.");
        String addDog;
        boolean isDogExit = true;
        while(isDogExit) {
            System.out.println("Next command: ");
            addDog = userInput.next();
            switch (addDog) {
                case "add" :
                    System.out.println("What is it name?");
                    String dogName = userInput.next();
                    System.out.println("What is it age?");
                    int dogAge = userInput.nextInt();
                    test.addDog(new Dog(dogName, dogAge));
                    System.out.println("Your dog's been added successful!");
                    break;
                case "show" :
                    System.out.println(test.toString());
                    break;
                case "exit" :
                    isDogExit = false;
                    break;
                default :
                    System.out.println("Incorrect format. Try again. ");
            }
        }
    }
}