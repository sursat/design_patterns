package behavioural.strategyPattern;

/**
 * Created by prasad on 5/3/17.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}