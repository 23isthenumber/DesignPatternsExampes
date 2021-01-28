package logic;


import creationalPatterns.abstractFactoryDemo.AbstractFactoryDemo;
import creationalPatterns.factoryDemo.FactoryPatternDemo;
import creationalPatterns.singletonDemo.SingletonDemo;

public class DemoFactory implements AbstractFactory{
    private static DemoFactory instance = new DemoFactory();

    private DemoFactory (){

    }

    public static DemoFactory getInstance(){
        return instance;

    }

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
