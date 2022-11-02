package Task1;

class List {
    private ListElement head;
    private ListElement tail;

    private boolean isEmpty(ListElement listElement) { // can be changed
        return listElement == null;
    }

    public void addFront(int value) {
        ListElement firstListElement = new ListElement();
        firstListElement.data = value;

        if(isEmpty(head)) {
            head = firstListElement;
            tail = firstListElement;
        } else {
            firstListElement.next = head;
            head = firstListElement;
        }
    }

    public void addBack(int value) {
        ListElement lastListElement = new ListElement();
        lastListElement.data = value;

        if (isEmpty(tail)) {
            head = lastListElement;
            tail = lastListElement;
        } else {
            tail.next = lastListElement;
            tail = lastListElement;
        }
    }

    public void printList() {
        ListElement firstListElement = head;

        while (!(isEmpty(firstListElement))) {
            System.out.print(firstListElement.data + " ");
            firstListElement = firstListElement.next;
        }
    }

    public void delEl(int value) {
        if(isEmpty(head)) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;

            System.out.println("List is empty now");
            return;
        }

        if (head.data == value) {
            head = head.next;

            return;
        }

        ListElement lastListElement = head;

        while (!(isEmpty(lastListElement.next))) {
            if (lastListElement.next.data == value) {
                if(tail == lastListElement.next) {
                    tail = lastListElement;
                }
                lastListElement.next = lastListElement.next.next;
                return;
            }
            lastListElement = lastListElement.next;
        }
    }
}
