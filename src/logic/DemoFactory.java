package logic;



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
    private static final DemoFactory instance = new DemoFactory();

    private DemoFactory (){

    }

    public static DemoFactory getInstance(){
        return instance;

    }

    @Override
    public PatternDemo produce(String whatToProduce) {
        return switch (whatToProduce) {
            case "Factory" -> new FactoryPatternDemo();
            case "AbstractFactory" -> new AbstractFactoryDemo();
            case "Singleton" -> new SingletonDemo();
            case "Builder" -> new BuilderPatternDemo();
            case "Prototype" -> new PrototypePatternDemo();
            case "Adapter" -> new AdapterPatternDemo();
            case "Bridge" -> new BridgePatternDemo();
            case "Composite" -> new CompositePatternDemo();
            case "Decorator" -> new DecoratorPatternDemo();
            case "Facade" -> new FacadePatternDemo();
            case "Filter" -> new CriteriaPatternDemo();
            case "Flyweight" -> new FlyweightPatternDemo();
            case "Proxy" -> new ProxyPatternDemo();
            case "ChainOfResponsibility" -> new ChainPatternDemo();
            case "Command" -> new CommandPatternDemo();
            case "Interpreter" -> new InterpreterPatternDemo();
            case "Iterator" -> new IteratorPatternDemo();
            case "Mediator" -> new MediatorPatternDemo();
            case "Memento" -> new MementoPatternDemo();
            case "Nullobject" -> new NullPatternDemo();
            case "Template" -> new TemplatePatternDemo();
            case "Observer" -> new ObserverPatternDemo();
            case "State" -> new StatePatternDemo();
            case "Strategy" -> new StrategyPatternDemo();
            case "Visitor" -> new VisitorPatternDemo();
            default -> null;
        };

    }
}
