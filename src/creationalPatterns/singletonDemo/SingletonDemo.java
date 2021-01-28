package creationalPatterns.singletonDemo;

import logic.PatternDemo;

public class SingletonDemo implements PatternDemo {
    public SingletonDemo(){

        SingleObject object = SingleObject.getInstance();


        object.showMessage();
        holdProgram();
    }



}
