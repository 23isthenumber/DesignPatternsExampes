package behavioralPatterns.stateDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class StatePatternDemo implements PatternDemo {
    public StatePatternDemo() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        holdProgram();
    }
}
