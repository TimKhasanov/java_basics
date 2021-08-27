public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(4,2);
        arithmeticCalculator.calculate(Operation.ADD);
        System.out.println(arithmeticCalculator.getResult());
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        System.out.println(arithmeticCalculator.getResult());
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        System.out.println(arithmeticCalculator.getResult());
    }
}
