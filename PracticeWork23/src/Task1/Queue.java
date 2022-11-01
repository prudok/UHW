package Task1;

public class Queue {

    private int size;
    private int items[];
    private int front, rear;

    public Queue(int size) {
        assert(size >= 1);

        this.size = size;
        items = new int[size];

        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            int element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index:" + front);
            System.out.println("Items: ");
            for (int ind = front; ind <= rear; ++ind)
                System.out.print(items[ind] + " ");
            System.out.println("\nRear index: " + rear);
        }
    }
}