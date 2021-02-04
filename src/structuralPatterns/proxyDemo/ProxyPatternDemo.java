package structuralPatterns.proxyDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class ProxyPatternDemo implements PatternDemo {

    public ProxyPatternDemo() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();

        holdProgram();
    }
}
