package logic;

import creationalPatterns.factoryDemo.FactoryPatternDemo;

public class DemoFactory {

    public PatternDemo getPatternDemo (String whichDemo){
        if (whichDemo=="Factory"){
            return new FactoryPatternDemo();
        }
        return null;
    }
}
