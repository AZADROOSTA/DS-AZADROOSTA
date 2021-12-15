
public class Hw49 {

    public static void main(String[] args) {

        try {
            
            SLL sl = new SLL();

            sl.add(5);
            sl.add(2);
            sl.add(7);
            sl.add(6);
            sl.add(1);
            sl.add(4);
            sl.add(-1);
            sl.add(3);
            
            sl.ChangList(9);
            
            System.out.println(sl.toString());
            System.out.println(sl.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
