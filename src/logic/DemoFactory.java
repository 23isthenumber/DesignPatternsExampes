package logic;


import creationalPatterns.abstractFactoryDemo.AbstractFactoryDemo;
import creationalPatterns.factoryDemo.FactoryPatternDemo;
import creationalPatterns.singletonDemo.SingletonDemo;

public class DemoFactory implements AbstractFactory{


    @Override
    public PatternDemo produce(String whatToProduce) {
        if (whatToProduce == "Factory") {
            return new FactoryPatternDemo();
        }
        else if (whatToProduce=="AbstractFactory"){
            return new AbstractFactoryDemo();
        }
        else if (whatToProduce=="Singleton"){
            return new SingletonDemo();
        }
        return null;
    }
}
