package behavioural.strategyPattern;

/**
 * Created by prasad on 5/3/17.
 * <p>
 * Description: In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior
 * varies as per its strategy object. The strategy object changes the executing algorithm of the context object.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}