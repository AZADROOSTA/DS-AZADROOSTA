
public class Hw44 {

    public static void main(String[] args) {

        SLL sl = new SLL();
        
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.add(-1);
        
        
        sl.reverse(sl.getNode(0));

        System.out.println(sl.toString());

    }
    
    
}
