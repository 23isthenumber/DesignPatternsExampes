package structuralPatterns.facadeDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class FacadePatternDemo implements PatternDemo {
    public FacadePatternDemo() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        holdProgram();
    }
}
