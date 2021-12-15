
public class DLL {

    private Node head;
    private Node tail;
    private int count;

    public DLL() {
        head = new Node(null, null, tail);
        tail = new Node(null, head, null);
        count = 0;
    }

    
    public void add(Object o) {
        Node n = new Node(o, null, null);
        Node nNode = tail.prev;
        tail.prev = n;
        n.next = tail;
        nNode.next = n;
        n.prev = nNode;
        count++;
    }

    public Object removeFirst() {
        Node n = null;
        if (count >= 1) {
            n = head.next;
            head.next = n.next;
            n.next.prev = head;
            count--;
        }
        return n.item;
    }

    public Object removeLast() {
        Node n = null;
        if (count >= 1) {
            n = tail.prev;
            tail.prev = n.prev;
            n.prev.next = tail;
            count--;
        }
        return n.item;
    }

    public int size() {
        return count;
    }

    

    @Override
    public String toString(){
        
        String s = "";
        
        for(Node n1= head.next; n1 != tail; n1 = n1.next){
            for(Node n2 = head.next ; n2 != tail ; n2 = n2.next){
                if(n1.item.getClass() == Integer.class && n2.item.getClass() == Integer.class){
                    if((int)n1.item + (int)n2.item == 87){
                        s += n1.item + " ";
                    }
                }
            }
        }        
        
        return s;
    }
    
    
    
}
