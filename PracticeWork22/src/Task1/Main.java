package Task1;

public class Main {
    public static void main(String[] args) {
        RpnCalculator rpnCalculator = new RpnCalculator(5);
        rpnCalculator.inputExpression("1 2 + 4 * 3 +");
        rpnCalculator.printAnswer();
        rpnCalculator = new RpnCalculator(5);
        rpnCalculator.inputExpression("2 3 * 4 5 * +");
        rpnCalculator.printAnswer();
        rpnCalculator = new RpnCalculator(5);
        rpnCalculator.inputExpression("2 3 4 5 6 * + - /");
        rpnCalculator.printAnswer();
    }
}