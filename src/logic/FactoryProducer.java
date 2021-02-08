package logic;

public class FactoryProducer {
    public static AbstractFactory getFactory (String whichFactory){


        if (whichFactory.equals("PatternTypeFactory")){
            return PatternTypeFactory.getInstance();
        }
        else if (whichFactory.equals("DemoFactory")){
            return DemoFactory.getInstance();
        }
        return null;
    }
}
