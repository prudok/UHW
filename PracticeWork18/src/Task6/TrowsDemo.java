package Task6;

public class TrowsDemo {
        public void printMessage(String key) {
            try{
                if(key == null) throw new NullPointerException("null key");
                String message = getDetails(key);
                System.out.println( message );
            }catch (Exception err) {
                System.out.println("Error: " + err);
            }
        }
        public String getDetails(String key) {
            try{
                if(key == null) throw new NullPointerException("null key in getDetails");
                return "data for: " + key;
            }catch (Exception err) {
                System.out.println("Error: " + err);
                return null;
            }
        }
}
