import java.util.*;

public class SetBasics {
    


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        set.remove(10);

        System.out.println(set); // [10, 20]
    }
}

