public class Practice {
    public static void main(String[] args) {
        Node head = new Node('g', null);
        Node ryan = new Node('s', new Node('v', null));
        head.next = ryan;

        System.out.println(head.next.next.value);
        head = head.next;
        printlist(head);

    }

    public static void printlist(Node start) {
        Node current = start; 
        while (current.next!=null) {
            System.out.println(current.value);
            current = current.next;
        }

    }
}
