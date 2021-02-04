package behavioralPatterns.strategyDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class StrategyPatternDemo  implements PatternDemo {
    public StrategyPatternDemo() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        holdProgram();
    }
}
