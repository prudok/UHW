package Task1_5;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (Exception err) {
            System.out.println("Error: " + err);
        } finally {
            System.out.println("Finally procces's been completed.");
        }
    }
}