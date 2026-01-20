public class MyLL<T> {
    private class Node<E> {
        public T value;
        public Node<E> next;
        public Node<E> last;

        public Node(T x, Node<E> y, Node<E> z) {
            this.value = x;
            this.next = y;
            this.last = z;
        }
    }
    private Node<T> head;
    private Node<T> tail;

    public MyLL() {
        head = null;
        tail = null;
    }
    public void printlist() {
        Node<T>  current = head; 
        while (current.next!=null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);

    }
    public void printlistbackwards() {
        Node<T>  current = tail; 
        while (current.last!= null) {
            System.out.println(current.value);
            current = current.last;
        }
        System.out.println(current.value);
    }

    public boolean contains(T ToFind) {
        Node<T> current = head;

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

    public T remove(T target) {
        if (head == null) {
            return null;
        }
        if (head.value == target) {
            head = head.next;
            head.last = null;
            return null;
        }
        Node<T> current = head;

        while (current.next!=null) {
            if (current.next.value == target) {
                current.next = current.next.next;
                if (current.next !=null) {
                    current = current.next;
                    current.last = current.last.last; 
                }
                else {
                    tail = current;
                }
                return target;
            }
            else {
                current = current.next;
            }
        }
        return null;
    }

    public void addToBack (T toAdd) {
        if (head == null) {
            head = new Node<T>(toAdd, null, null);
            tail = head;
            return;
        }
        Node<T> current = head;
        while (current.next!=null) {
            current = current.next;
        } 
        current.next = new Node<T> (toAdd, null, current);
        tail = current.next;
    }
}