import java.util.HashMap;
import java.util.Map;

public class EmployeeDepartmentHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeDept = new HashMap<>();

        employeeDept.put(1001, "Finance");
        employeeDept.put(1002, "Human Resources");
        employeeDept.put(1003, "Marketing");
        employeeDept.put(1004, "IT");

        System.out.println("Employee Departments:");
        for(Map.Entry<Integer, String> entry : employeeDept.entrySet()) {
            System.out.println("Employee ID " + entry.getKey() + " works in " + entry.getValue());
        }
    }
}
