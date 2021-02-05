package logic;

import behavioralPatterns.*;

public class BehavioralFactory {
    public Pattern getPattern (String whichPattern){

        if (whichPattern=="ChainOfResponsibility"){
            return new ChainOfResponsibility();
        }
        else if (whichPattern=="Command"){
            return new Command();
        }
        else if (whichPattern=="Intepreter"){
            return new Interpreter();
        }
        else if (whichPattern=="Iterator"){
            return new Iterator();
        }
        else if (whichPattern=="Mediator"){
            return new Mediator();
        }
        else if (whichPattern=="Memento"){
            return new Memento();
        }
        else if (whichPattern=="Nullobject"){
            return new Nullobject();
        }
        else if (whichPattern=="Observer"){
            return new Observer();
        }
        else if (whichPattern=="State"){
            return new State();
        }
        else if (whichPattern=="Strategy"){
            return new Strategy();
        }
        else if (whichPattern=="Template"){
            return new Template();
        }
        else if (whichPattern=="Visitor"){
            return new Visitor();
        }
        return null;

    }
}
