@FunctionalInterface
interface Service {
    String name = "Avinash";
    String voteCheck(String name, int age, String location);
}

public class LambdaExpressionEx3 {
    public static void main(String[] args) {
        Service service = (name, age,
                location) -> ((age >= 18) && (location.equalsIgnoreCase("hyderabad")) ? "your eligible to vote"
                        : "your are not eligible to vote");
        String status = service.voteCheck("Avinash", 20, "hyderabad");
        System.out.println(Service.name + " " + status);
    }
}
