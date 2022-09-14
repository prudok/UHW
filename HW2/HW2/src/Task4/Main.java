package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many computers do you want to add?");
        Computers collectionPC = new Computers(userInput.nextInt());
        System.out.println("Commands: use 'add' and then enter name of pc to add pc into collection. Use 'delete' and then enter name of pc to delete pc from computers collection.");
        System.out.println("Use 'find' to find pc name. Use 'show' to see all computers. In order to exit, enter 'exit'.");
        String answerFromUser;
        boolean isExit = true;

        while(isExit) {
            System.out.println("Next command: ");
            answerFromUser = userInput.next();
            switch (answerFromUser) {
                case "exit" :
                    isExit = false;
                    break;
                case "add" : collectionPC.add(userInput.nextLine()); break;
                case "delete" : collectionPC.delete(userInput.nextLine()); break;
                case "find" : collectionPC.find(userInput.nextLine()); break;
                case "show" : collectionPC.showAllComputers(); break;
                default : System.out.println("Incorrect command. Try again.");
            }
        }
    }
}