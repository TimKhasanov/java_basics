public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(4,2);
        arithmeticCalculator.calculate(Operation.ADD);
        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        System.out.println(arithmeticCalculator.calculate(Operation.SUBTRACT));
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));

    }
}
