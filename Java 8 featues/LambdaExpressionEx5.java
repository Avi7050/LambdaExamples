import java.util.*;
import java.util.stream.Collectors;
class Student{
    int id;
    String name;
    static String school = "Jain University";
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
}
public class LambdaExpressionEx5 {
    public static void main(String[] args) {
        Set<String> colors = Set.of("Pink","Black","pink","white");
        colors.forEach(color -> System.out.println(color));

        Set<Integer> numbers = Set.of(1,2,3,4,5,6);
        numbers.stream().filter(i -> i>=0).collect(Collectors.toSet()).forEach(number -> System.out.print(number + " "));
        System.out.println();

        Set<Student> students = Set.of(new Student(1, "Avinash"),new Student(2, "Kartik"));
        students.forEach(student -> System.out.println(student.id + " " + student.name + " " + Student.school));
    }
}
