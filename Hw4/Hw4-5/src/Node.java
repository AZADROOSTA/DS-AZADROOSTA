
public class Node {

    Object item ;
    Node prev;
    Node next;
    
    public Node(Object i , Node p , Node n){
        item = i;
        prev = p;
        next = n;
    }
}
