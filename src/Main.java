import polishnotation.ReversePolishNotationCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        int result = calculator.calculatePolishNotation("2 3 +");
        System.out.println("result = " + result);
    }
}