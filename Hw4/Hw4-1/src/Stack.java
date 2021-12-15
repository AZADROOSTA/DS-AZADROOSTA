
import java.util.LinkedList;


public class Stack {

    private LinkedList ll ;
    
    
    public Stack(){
        ll = new LinkedList();
    }    
    
    
    public boolean isEmpty(){
        return ll.isEmpty();
    }
    
    public int size(){
        return ll.size();
    }
    
    public void push(Object o){
        ll.addFirst(o);
    }
    
    public Object pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        
        Object o = ll.getFirst();
        ll.removeFirst();
        return o;
    }
}
