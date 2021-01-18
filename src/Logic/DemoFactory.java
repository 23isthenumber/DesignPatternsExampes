package logic;

import creationalPatterns.factoryDemo.FactoryPatternDemo;

public class DemoFactory {

    public DemoFactory (String whichDemo){
        if (whichDemo=="Factory"){
            new FactoryPatternDemo();
        }
    }
}
