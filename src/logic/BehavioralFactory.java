package logic;

import behavioralPatterns.*;

public class BehavioralFactory {
    public Pattern getPattern (String whichPattern){

        return switch (whichPattern) {
            case "ChainOfResponsibility" -> new ChainOfResponsibility();
            case "Command" -> new Command();
            case "Intepreter" -> new Interpreter();
            case "Iterator" -> new Iterator();
            case "Mediator" -> new Mediator();
            case "Memento" -> new Memento();
            case "Nullobject" -> new Nullobject();
            case "Observer" -> new Observer();
            case "State" -> new State();
            case "Strategy" -> new Strategy();
            case "Template" -> new Template();
            case "Visitor" -> new Visitor();
            default -> null;
        };

    }
}
