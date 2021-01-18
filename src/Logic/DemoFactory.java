package Logic;

import creationalPatterns.FactoryDemo.FactoryPatternDemo;

public class DemoFactory {

    public DemoFactory (String whichDemo){
        if (whichDemo=="Factory"){
            new FactoryPatternDemo();
        }
    }
}
