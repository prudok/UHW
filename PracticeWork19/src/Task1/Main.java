package Task1;

public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client("Roman", "Sergeevich", "Prudchenko", 17465748L);
            Order order = new Order(client);
            Order.isValidINN(client.getINN());
        } catch(nonValidException err) {
            System.out.println("Error: " + err + err.getNumber());
        }
    }
}