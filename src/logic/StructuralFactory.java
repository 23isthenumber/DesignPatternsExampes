package logic;

import structuralPatterns.*;


public class StructuralFactory {

    public Pattern getPattern (String whichPattern){

        if (whichPattern=="Adapter"){
            return new Adapter();
        }
        else if (whichPattern=="Bridge"){
            return new Bridge();
        }
        else if (whichPattern=="Composite"){
            return new Composite();
        }
        else if (whichPattern=="Decorator"){
            return new Decorator();
        }
        else if (whichPattern=="Facade"){
            return new Facade();
        }
        else if (whichPattern=="Filter"){
            return new Filter();
        }
        else if (whichPattern=="Flyweight"){
            return new Flyweight();
        }
        else if (whichPattern=="Proxy"){
            return new Proxy();
        }
        return null;

    }
}
