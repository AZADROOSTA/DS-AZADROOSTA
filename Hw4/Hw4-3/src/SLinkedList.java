
public class SLinkedList {

    private Node head;

    public SLinkedList() {
        head = null;
    }

    public SLinkedList(Object o) {
        head = new Node(o, null);
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
        return (size() == 0);
    }

    public Object get(int index) {
        Node n = head;
        for (int i = 1; i < index; i++) {
            n = n.next;
        }
        return n.next.item;
    }

    public void add(int index, Object o) throws Exception {
        if (index > size() + 1) {
            throw new Exception("this index is not valid !");
        }

        Node n = new Node(o, null);
        Node nn;
        if (size() == 0) {
            head = n;
        } else if (index == 0) {
            nn = head;
            head = n;
            head.next = nn;
        } else if (index <= size()) {
            nn = head;
            for (int i = 0; i < index - 1; i++) {
                nn = nn.next;
            }
            n.next = nn.next;
            nn.next = n;
        } else if (index > size()) {
            for (nn = head; nn != null; nn = nn.next);
            nn.next = n;
        }

    }

    public void remove(int index) throws Exception {

        if (index < 0 || index >= size()) {
            throw new Exception("index out of bound!");
        }

        Node n = head;
        for (int i = 1; i < index; i++) {
            n = n.next;
        }

        if (index == size()) {
            n.next = null;
        }

        Node nNode = n.next;
        n.next = nNode.next;
        n = null;

    }

    public void removeAll() {

        while (size() > 1) {
            Node nNode = head.next;
            head = nNode;
        }
        head = null;
    }

    public void swap(int i, int j) throws Exception {

        if ((i > size() || i < 0) || (j > size() || j < 0)) {
            throw new Exception("index out of Bound!");
        }

        Node n1 = head;
        Node n2 = head;

        for (int k = 0; k < i; k++) {
            n1 = n1.next;
        }
        
        for (int k = 0; k < j; k++) {
            n2 = n2.next;
        }
        
        Object temp = n1.item;
        n1.item = n2.item;
        n2.item = temp;
    }
}
