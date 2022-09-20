package Task4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(100, 10);
        Phone phone = new Phone(14, "Android");
        phone.getPrice();
        computer.getPrice();

        System.out.println(computer);
        System.out.println(phone);
    }
}