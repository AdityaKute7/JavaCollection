
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "Aditya");
        student.put(2, "Alice");
        student.put(3, "Bob");
        student.put(4, "Charlie");
        student.put(4, "Aman");         // The duplicate Key with not throw any error it just REPLACE the privious entry

        System.out.println(student);

        System.out.println(student.get(1));
        System.out.println(student.get(10));

        Set<Integer> s1 = student.keySet();
        System.out.println(s1);            // It will Print the KEYS

        for(int i : s1){
            System.out.println(i);            //// It will Print the KEYS by itrating
        }
        
        Set<Map.Entry<Integer,String>> std = student.entrySet();
        for(Entry<Integer, String> i : std){
            System.out.println(i);
            System.out.println(i.getKey()+ ":" +i.getValue());
        }

        

    }
}
