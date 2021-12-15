
public class DLinkedList {

    private Node head;
    private Node tail;
    private int count;

    public DLinkedList() {
        head = new Node(null, null, tail);
        tail = new Node(null, head, null);
        count = 0;
    }

//    public void addFirst(Object o){
//        Node n = new Node(o , null , null);
//        Node nNode = head.next;
//        head.next = n;
//        n.prev = head;
//        nNode.prev = n;
//        n.next = nNode;
//    }
    public void Insert(Object o) {
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

    public int Count() {
        return count;
    }

    public void reverse() {

        head.next.prev = tail;
        tail.prev.next = head;
        Node nNode = head.next;
        head.next = tail.prev;
        tail.prev = nNode;

        for(Node n = head.next ; n != tail ; n = n.next){
            Node nn = n.next;
            n.next = n.prev;
            n.prev = nn;
        }
    }

    public void display(){
        
        String s = "{ ";
        for(Node n = head.next ; n != tail ; n = n.next){
            if(n.next != tail){
                s += n.item + " -> ";
            }else{
                s += n.item;
            }
        }
        s += " }";
        
        System.out.println(s);
    }
    
    public void removegt(int a){
        
        for(Node n = head.next ; n != tail ; n = n.next){
            if((int)n.item > a){
                n.prev.next = n.next;
                n.next.prev = n.prev;
                count--;
            }
        }
    }
    
    
}
