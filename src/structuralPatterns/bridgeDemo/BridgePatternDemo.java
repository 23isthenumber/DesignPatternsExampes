package structuralPatterns.bridgeDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class BridgePatternDemo implements PatternDemo {
    public BridgePatternDemo() {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        holdProgram();
    }
}
