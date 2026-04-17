
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>(3,2);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector.capacity());
        vector.add(40);
        vector.add(50);
        System.out.println(vector.capacity());
        vector.add(50);
        System.out.println(vector.capacity());

        System.out.println(vector);

        vector.remove(2);
        System.out.println(vector);
        vector.remove(Integer.valueOf(50));       // It will remove first Occarance
        System.out.println(vector);
        
        System.out.println(vector.contains(30));

        System.out.println(vector.size());
         vector.clear();
         System.out.println(vector);
        
    }
}
