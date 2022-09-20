package Task4;

public class Computer implements Priceable{

    private double price;
    private int amount;

    public Computer() {
        price = 0;
        amount = 0;
    }
    public Computer(double price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public void getInfo() {
        System.out.println("The number of computers: " + amount);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void getPrice() {
        System.out.println("The price: " + price);
    }

    @Override
    public String toString() {
        return "Price: " + price + ", amount: " + amount;
    }
}
