
import static java.lang.System.exit;

public class SLL {

    private Node head;
    private Node tail;

    public SLL() {
        head = null;
        tail = null;
    }

    public void add(Object o) {
        if (head == null || tail == null) {
            head = new Node(o, null);
            tail = head;
        } else {
            Node n = new Node(o, null);
            tail.next = n;
            tail = n;
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 0;

        for (Node n = head; n != null; n = n.next) {
            count++;
        }

        return count;
    }

    public boolean isEmpty() {
        return size() < 1;
    }

    public String toString() {

        if (head == null) {
            return "isEmpty";
        }else{

        String s = "{ ";
        for (Node n = head; n != tail; n = n.next) {
            s += n.item + " -> ";
        }
        s += tail.item + " }";

        return s;
        }
    }

    public Node getNode(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    public Object get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.item;
    }

    public void reverse(Node n) {

        if (n == null) {
            return;
        }

        if (size() == 1) {
            return;
        }

        if (n.next == tail) {
            Node nn = head;
            head = tail;
            tail = nn;

            head.next = n;
        } else {
            reverse(n.next);
            Node n1 = n;
            n1.next.next = n;
        }
    }
}
