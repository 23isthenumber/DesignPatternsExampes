package logic;

public class FactoryProducer {
    public static AbstractFactory getFactory (String whichFactory){


        if (whichFactory=="PatternTypeFactory"){
            return PatternTypeFactory.getInstance();
        }
        else if (whichFactory=="DemoFactory"){
            return DemoFactory.getInstance();
        }
        return null;
    }
}
