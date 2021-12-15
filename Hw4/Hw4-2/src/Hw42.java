
public class Hw42 {

    public static void main(String[] args) {

        DLinkedList dl = new DLinkedList();
        
        dl.Insert(1);
        dl.Insert(5);
        dl.Insert(3);
        dl.Insert(10);
        
        dl.reverse();
        dl.removegt(5);
        dl.display();
        System.out.println(dl.Count());
        System.out.println(dl.removeFirst());
        System.out.println(dl.Count());
//        System.out.println(dl.removeFirst());
//        System.out.println(dl.removeFirst());
//        System.out.println(dl.removeFirst());

    }
    
    
}
