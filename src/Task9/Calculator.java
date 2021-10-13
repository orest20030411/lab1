package Task9;
import Task8.CustomDouble;

public class Calculator {
    public double operations(final CustomDouble a, final char symbol, final CustomDouble b) {
        switch (symbol) {
            case '+':
                return a.add(b).toDouble();
            case '-':
                return a.substraction(b).toDouble();
            case '*':
                return a.multiplication(b).toDouble();
            case '/':
                return a.divide(b).toDouble();
            default:
                throw new Error("Wrong symbol! Try again!");
        }
    }
}