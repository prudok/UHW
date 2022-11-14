package Task9;

public class StringList {
    public Node head = null;
    public Node tail = null;

    public void addNode(String data) {
        Node tempNode = new Node(data);

        if (head == null) {
            head = tempNode;
            tail = tempNode;
        } else {
            tail.setNext(tempNode);
            tail = tempNode;
        }
        sortList();
    }

    public void sortList() {
        Node currentNode = head, index = null;
        String temp;

        if (head == null) {
            return;
        } else {
            while (currentNode != null) {
                index = currentNode.getNext();

                while (index != null) {
                    if (currentNode.getData().length() > index.getData().length()) {
                        temp = currentNode.getData();
                        currentNode.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                currentNode = currentNode.getNext();
            }
        }
    }

    public void printStringList() {
        Node currentNode = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println("\n");
    }

}
