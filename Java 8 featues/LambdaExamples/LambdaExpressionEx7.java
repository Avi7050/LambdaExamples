package LambdaExamples;

import java.util.List;
import java.util.stream.Collectors;
class Employee{
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class LambdaExpressionEx7 {
    public static void main(String[] args) {
        // List.of("devi","raju","rani","ravi","krishna","raju","rani","king","deyam","ratan");
        List<Employee> emps = List.of(new Employee(1, "Avinash", 10000.00),
                                        new Employee(2, "kartik",1000.67),
                                             new Employee(3, "Akash",2000.70));

                 emps.stream().filter(emp -> emp.name.startsWith("A"))
                        .forEach(emp -> System.out.println(emp.id+ " " +emp.name));

                List<Employee> e = emps.stream().filter(emp -> emp.salary>1500).collect(Collectors.toList());
                e.forEach(emp -> System.out.println(emp.id+" "+emp.name+" "+emp.salary));

                List<Employee> emplist = emps.stream().filter(emp -> emp.id == 1).collect(Collectors.toList());
                emplist.forEach(emp -> System.out.println(emp.id+" "+emp.name+" "+emp.salary));

                emps.stream().filter(emp -> emp.name.startsWith("k")).collect(Collectors.toList())
                                .forEach(emp -> System.out.println(emp.id + " " +emp.name + " " + emp.salary));
    }
}
