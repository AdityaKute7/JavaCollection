import java.util.Vector;

public class VectorThreadSafty {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // Thread t1 = new Thread(() -> {
        //     for(int i=1;i<=1000;i++){
        //         list.add(i);
        //     }
        // });

        // Thread t2 = new Thread(() -> {
        //     for(int i=1;i<=1000;i++){
        //         list.add(i);
        //     }
        // });

        // t1.start();
        // t2.start();

        // try {
        //     t1.join();
        //     t2.join();
        // } catch (Exception e) {
        // }


        // System.out.println("Size of List : " +list.size());


//    With Vector we can perform Thread safe oparations


        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=1000;i++){
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=1000;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }


        System.out.println("Size of List : " +list.size());
    }
}
