import java.util.Map;
import java.util.TreeMap;

public class StudentDetailsTreeMap {

    static class Student {
        String name;
        int age;
        String major;

        Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        @Override
        public String toString() {
            return name + ", " + age + " years old, Major: " + major;
        }
    }

    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>();
        students.put(102, new Student("Alice", 20, "Computer Science"));
        students.put(101, new Student("Bob", 22, "Electrical Engineering"));
        students.put(103, new Student("Charlie", 19, "Mathematics"));

        System.out.println("Students sorted by ID:");
        for(Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
