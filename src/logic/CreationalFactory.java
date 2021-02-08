package logic;

import creationalPatterns.*;
import creationalPatterns.AbstractFactory;


public class CreationalFactory {

    public Pattern getPattern (String whichPattern){

        return switch (whichPattern) {
            case "Factory" -> new Factory();
            case "AbstractFactory" -> new AbstractFactory();
            case "Singleton" -> new Singleton();
            case "Builder" -> new Builder();
            case "Prototype" -> new Prototype();
            default -> null;
        };

    }

}
