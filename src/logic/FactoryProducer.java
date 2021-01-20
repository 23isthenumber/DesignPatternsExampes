package logic;

public class FactoryProducer {
    public static AbstractFactory getFactory (String whichFactory){
        if (whichFactory=="PatternTypeFactory"){
            return new PatternTypeFactory();
        }
        else if (whichFactory=="DemoFactory"){
            return new DemoFactory();
        }
        return null;
    }
}
