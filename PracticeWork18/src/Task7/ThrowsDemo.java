package Task7;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
         String message = getDetails(key);
         System.out.println( message );
    }
    private String getDetails(String key) {
        try {
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        } catch (Exception err) {
            System.out.println("Error: " + err);
            return "";
        }
    }
}
