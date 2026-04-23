import java.util.*;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class SetExample {
    public static void main(String[] args) {
        EnumSet<Day> set = EnumSet.of(Day.MONDAY, Day.WEDNESDAY);

        System.out.println(set); // [MONDAY, WEDNESDAY]
    }
}