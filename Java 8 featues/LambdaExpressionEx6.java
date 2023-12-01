import java.util.Map;
class Employeee{
    int id;
    String name;
    public Employeee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class LambdaExpressionEx6 {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = Map.of("My",2,"name",4,"is",2,"Avinash",7);
        wordCount.forEach((k,v) -> System.out.println("key " + k + " value " + v));
        System.out.println();
        Map<Integer,Employeee> emps = Map.of(1,new Employeee(1, "Avinash"),2,new Employeee(2, "Kartik"));
        emps.forEach((n,emp) -> System.out.println(n + " " + emp.id + " " + emp.name));
    }
}
