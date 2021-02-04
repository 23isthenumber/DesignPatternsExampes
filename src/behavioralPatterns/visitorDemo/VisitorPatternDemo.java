package behavioralPatterns.visitorDemo;

import logic.PatternDemo;

//tutorialspoint.com
public class VisitorPatternDemo implements PatternDemo {
    public VisitorPatternDemo() {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        holdProgram();
    }
}
