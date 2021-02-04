package behavioralPatterns.mediatorDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class MediatorPatternDemo implements PatternDemo {
    public MediatorPatternDemo() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

        holdProgram();
    }
}
