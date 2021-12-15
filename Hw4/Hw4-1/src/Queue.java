
import java.util.LinkedList;


public class Queue {

    private LinkedList ll ;
    
    public Queue(){
        ll = new LinkedList();
    }
    
    public boolean isEmpty(){
        return ll.isEmpty();
    }
    
    public int size(){
        return ll.size();
    }
    
    public void enQueue(Object o){
        ll.addFirst(o);
    }
    
    public Object deQueue()throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        
        return ll.removeLast();
    }
}
