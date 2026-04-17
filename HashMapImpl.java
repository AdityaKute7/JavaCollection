
import java.util.HashMap;
import java.util.Objects;


class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.rollNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rollNo != other.rollNo) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Name : "+name+ "  roll No : " +rollNo;
    }    
}

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Student, Integer> map = new HashMap<>();
        Student s1 = new Student("Aditya", 07);
        Student s2 = new Student("Naman", 15);
        Student s3 = new Student("Aditya", 07);
        
        map.put(s1, 90);
        map.put(s2, 99);
        map.put(s3, 95);

        System.out.println(map.size());
        System.out.println(map.get(s1));
        System.out.println(map.get(s3));

        System.out.println(s1);
        System.out.println(s2);
    }
}
