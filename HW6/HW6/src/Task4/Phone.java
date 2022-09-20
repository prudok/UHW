package Task4;

public class Phone implements Priceable{

    private double price;
    private String name;

    public Phone() {
        price = 0;
        name = "";
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void getPrice() {
        System.out.println("Price of phone: " + price);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone price: " + price + ", name: " + name;
    }
}
