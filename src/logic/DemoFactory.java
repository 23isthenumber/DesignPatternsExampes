package logic;


import behavioralPatterns.Observer;
import behavioralPatterns.chainOfResponsibilityDemo.ChainPatternDemo;
import behavioralPatterns.commandDemo.CommandPatternDemo;
import behavioralPatterns.interpreterDemo.InterpreterPatternDemo;
import behavioralPatterns.iteratorDemo.IteratorPatternDemo;
import behavioralPatterns.mediatorDemo.MediatorPatternDemo;
import behavioralPatterns.mementoDemo.MementoPatternDemo;
import behavioralPatterns.nullobjectDemo.NullPatternDemo;
import behavioralPatterns.observerDemo.ObserverPatternDemo;
import behavioralPatterns.stateDemo.StatePatternDemo;
import behavioralPatterns.strategyDemo.StrategyPatternDemo;
import behavioralPatterns.templateDemo.TemplatePatternDemo;
import behavioralPatterns.visitorDemo.VisitorPatternDemo;
import creationalPatterns.abstractFactoryDemo.AbstractFactoryDemo;
import creationalPatterns.builder.BuilderPatternDemo;
import creationalPatterns.factoryDemo.FactoryPatternDemo;
import creationalPatterns.prototypeDemo.PrototypePatternDemo;
import creationalPatterns.singletonDemo.SingletonDemo;
import structuralPatterns.adapterDemo.AdapterPatternDemo;
import structuralPatterns.bridgeDemo.BridgePatternDemo;
import structuralPatterns.compositeDemo.CompositePatternDemo;
import structuralPatterns.decoratorDemo.DecoratorPatternDemo;
import structuralPatterns.facadeDemo.FacadePatternDemo;
import structuralPatterns.filterDemo.CriteriaPatternDemo;
import structuralPatterns.flyweightDemo.FlyweightPatternDemo;
import structuralPatterns.proxyDemo.ProxyPatternDemo;

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
        else if (whatToProduce=="Builder"){
            return new BuilderPatternDemo();
        }
        else if (whatToProduce=="Prototype"){
            return new PrototypePatternDemo();
        }
        else if (whatToProduce=="Adapter"){
            return new AdapterPatternDemo();
        }
        else if (whatToProduce=="Bridge"){
            return new BridgePatternDemo();
        }
        else if (whatToProduce=="Composite"){
            return new CompositePatternDemo();
        }
        else if (whatToProduce=="Decorator"){
            return new DecoratorPatternDemo();
        }
        else if (whatToProduce=="Facade"){
            return new FacadePatternDemo();
        }
        else if (whatToProduce=="Filter"){
            return new CriteriaPatternDemo();
        }
        else if (whatToProduce=="Flyweight"){
            return new FlyweightPatternDemo();
        }
        else if (whatToProduce=="Proxy"){
            return new ProxyPatternDemo();
        }
        else if (whatToProduce=="ChainOfResponsibility"){
            return new ChainPatternDemo();
        }
        else if (whatToProduce=="Command"){
            return new CommandPatternDemo();
        }
        else if (whatToProduce=="Interpreter"){
            return new InterpreterPatternDemo();
        }
        else if (whatToProduce=="Iterator"){
            return new IteratorPatternDemo();
        }
        else if (whatToProduce=="Mediator"){
            return new MediatorPatternDemo();
        }
        else if (whatToProduce=="Memento"){
            return new MementoPatternDemo();
        }
        else if (whatToProduce=="Nullobject"){
            return new NullPatternDemo();
        }
        else if (whatToProduce=="Template"){
            return new TemplatePatternDemo();
        }
        else if (whatToProduce=="Observer"){
            return new ObserverPatternDemo();
        }
        else if (whatToProduce=="State"){
            return new StatePatternDemo();
        }
        else if (whatToProduce=="Strategy"){
            return new StrategyPatternDemo();
        }
        else if (whatToProduce=="Visitor"){
            return new VisitorPatternDemo();
        }

        return null;
    }
}
