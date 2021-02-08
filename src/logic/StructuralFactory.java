package logic;

import structuralPatterns.*;


public class StructuralFactory {

    public Pattern getPattern (String whichPattern){

        return switch (whichPattern) {
            case "Adapter" -> new Adapter();
            case "Bridge" -> new Bridge();
            case "Composite" -> new Composite();
            case "Decorator" -> new Decorator();
            case "Facade" -> new Facade();
            case "Filter" -> new Filter();
            case "Flyweight" -> new Flyweight();
            case "Proxy" -> new Proxy();
            default -> null;
        };

    }
}
