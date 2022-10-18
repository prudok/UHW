package Task1;

public class Order {

    private Client client;

    public Order(Client client) {
        this.client = client;
    }

    public static void isValidINN(long value) throws nonValidException {

        long amount = 0;
        while(value > 0) {
            value /= 10;
            ++amount;
        }
        if((amount >= 10) && (amount <= 12)) {
            System.out.println("This INN is valid.");
        } else {
            throw new nonValidException("This INN is not valid, expected size: 10-12, actual: ", amount);
        }
    }
}
class nonValidException extends Exception {

    private long number;
    public long getNumber() {
        return number;
    }
    public nonValidException(String message, long num) {
        super(message);
        number = num;
    }
}

