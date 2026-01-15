public class MyLL {
    private Node head;

    public void printlist() {
        Node current = head; 
        while (current.next!=null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);

    }

    public boolean contains(char ToFind) {
        Node current = head;

        while (current.next!=null) {
            if (current.value==ToFind) {
                return true;
            }
            current = current.next;
        }
        if (current.value==ToFind) {
            return true;
        }
        else {
            return false;
        }
    }

    public char remove(char target) {
        Node current = head;

        while (current.next!=null) {
            if (current.next.value == target) {
                current.next = current.next.next;
                return target;
            }
        current = current.next;
        }
        return'0';
    }
}