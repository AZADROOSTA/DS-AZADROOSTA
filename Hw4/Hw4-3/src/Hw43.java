
public class Hw43 {

    public static void main(String[] args){


        try{
            SLinkedList sl = new SLinkedList();

            sl.add(0, 1);
            sl.add(1, 2);
            sl.add(2, 3);
            sl.add(3, 4);
            sl.add(4, 5);
            sl.add(5, 6);

            sl.swap(2, 5);
            
            System.out.println(sl.get(2));
            System.out.println(sl.get(5));
            
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
    }
    
}
