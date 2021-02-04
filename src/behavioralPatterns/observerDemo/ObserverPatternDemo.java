package behavioralPatterns.observerDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class ObserverPatternDemo implements PatternDemo {
    public ObserverPatternDemo() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        holdProgram();
    }
}
