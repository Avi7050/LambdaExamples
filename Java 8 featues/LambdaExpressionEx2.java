@FunctionalInterface
interface Operation {
    int add(int num1, int num2);
}
interface Operation1{
     float mul(int num1, int num2);
}

class LambdaExpressionEx2 {
    public static void main(String[] args) {
        Operation op = (num1, num2) -> (num1 + num2);
        int sum = op.add(10, 20);
        System.out.println("Sum = " + sum);

        Operation1 op1 = (num1, num2) -> (num1 * num2);
        float multiply = op1.mul(10, 20);
        System.out.println("Multiply = " + multiply);
    }
}
