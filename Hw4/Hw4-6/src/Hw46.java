
public class Hw46 {

    public static void main(String[] args) throws Exception {

        SLL sl = new SLL();

        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.add(6);
        sl.add(7);


        delete(sl,3,2);

        System.out.println(sl.size());
        System.out.println(sl.toString());
        
    }

    public static void delete(SLL sl, int a, int b) throws Exception{

        int c = a;
        Node n = sl.getNode(0);
        a--;
        for (int i = 1; i < sl.size(); i++) {
            
            if(a == 0){
                for(int j=0;j<b;j++){
                    sl.remove(i);
                }

                a = c;
            }
            a--;
            if(i < sl.size()){
                n = sl.getNode(i);
            }
        }
    }

}
