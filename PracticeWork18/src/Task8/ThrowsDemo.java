package Task8;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
            try{
                String key = myScanner.next();
                if(key.equals("")) throw new Exception("Key set to empty string");
                printDetails( key );
            }catch (Exception err) {
                System.out.println("Error" + err);
                System.out.println("Try again");
            } finally {
                String key = myScanner.next();
                printDetails(key);
            }
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        } catch (Exception err) {
            System.out.println("Error: " + err);
            return "";
        }
    }
}