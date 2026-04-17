
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{
    
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class ArrayListEx{
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(System.out::println);
        for(int i : list){
            System.out.println(i);
        }


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 3));
        System.out.println(list);

        // list.sort((a,b) -> b-a);
        list.sort(new MyComparator());
        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>(List.of("Hellow", "World", "Java"));
        System.out.println(list2);

        list2.sort((a,b) -> b.length() - a.length());
        System.out.println(list2);


        List<Integer> list3 = Arrays.asList(1, 2, 3);
        list1.forEach(System.out::println);
        list3.add(10);
        list3.remove(2);
        list3.set(0, 10);
        list3.forEach(System.out::println);


        ArrayList<Integer> list4 = new ArrayList<>(list1);
        list4.add(10);
        System.out.println(list4);

        List<Integer> list5 = List.of(1,2,3,4);
        list5.add(10);
        list5.remove(2);
        list5.set(0, 10);   
         list5.forEach(System.out::println); 
    

        
    }
}