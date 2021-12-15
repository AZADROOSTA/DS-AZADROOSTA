
public class Hw48 {

    public static void main(String[] args) {

        try {
            
            SLL sl = new SLL();

                    sl.add(1);
                    sl.add(2);
                    sl.add(3);
                    sl.add(4);
                    sl.add(5);
                    sl.add(6);
                    sl.add(7);
            System.out.println(sl.LastIndex(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
