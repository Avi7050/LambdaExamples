import java.util.*;
class Employee{
    int eid;
    String name;
    float salary;
    public Employee(int eid, String name, float salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }
    
}
public class LambdaExpressionEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Avinash","Kartik");
        names.forEach(name -> System.out.println(name));

        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();
        
        List<Employee> emps = Arrays.asList(new Employee(101,"Avinash",45000.45f),
                                            new Employee(102, "kartik", 25000.35f));
        emps.forEach(emp -> System.out.println(emp.eid +" "+emp.name + " " + emp.salary));
        
        }
}
