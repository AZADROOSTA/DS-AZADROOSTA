
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
        } else {

            String s = "{ ";
            for (Node n = head; n != null; n = n.next) {
                if (n != tail) {
                    s += n.item + " -> ";
                } else {
                    s += tail.item + " -> ";
                }
            }
            s += " }";

            return s;
        }
    }

    public Object get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.item;
    }

    public void remove(int index) throws Exception {

        if (index < 0 || index >= size()) {
            throw new Exception("index out of bound!");
        }

        Node n = head;
        for (int i = 1; i < index; i++) {
            n = n.next;
        }

        if (index == size() - 1) {
            tail = n;
            n.next = null;
        } else {
            Node nNode = n.next;
            n.next = nNode.next;
            n = null;
        }
    }

    public void ChangList(int y) throws Exception {

        if (size() < 1) {
            throw new Exception("List is null!");
        }

        
        Node n = head;

        while (n != null) {
            if(n.next == tail){
                if(y > (int)tail.item){
                    Node nNode = tail;
                    tail = n;
                    tail.next = null;
                    nNode.next = head;
                    head = nNode;
                    n = n.next;
                }else{
                    n = tail.next;
                }
            }else{
                if (y > (int) n.next.item) {
                    Node nNode = n.next;
                    n.next = nNode.next;
                    nNode.next = head;
                    head = nNode;
                }else{
                    n = n.next;
                }
            }
            
        }

    }

}
