@FunctionalInterface
interface Greeting {
    void greet();
}

class LambdaExpressionEx1 {
    public static void main(String[] args) {
        Greeting g1 = () -> System.out.println("Hello World");
        g1.greet();
    }
}
