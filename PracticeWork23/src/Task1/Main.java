package Task1;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.deQueue();
        for(int ind = 0; ind < 5; ++ind) {
            queue.enQueue(ind);
        }
        queue.enQueue(5);
        queue.display();
        queue.deQueue();
        queue.display();
    }
}