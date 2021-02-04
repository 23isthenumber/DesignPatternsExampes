package logic;

import creationalPatterns.*;
import creationalPatterns.AbstractFactory;


public class CreationalFactory {

    public Pattern getPattern (String whichPattern){

        if (whichPattern=="Factory"){
            return new Factory();
        }
        else if (whichPattern=="AbstractFactory"){
            return new AbstractFactory();
        }
        else if (whichPattern=="Singleton"){
            return new Singleton();
        }
        else if (whichPattern=="Builder"){
            return new Builder();
        }
        else if (whichPattern=="Prototype"){
            return new Prototype();
        }
        else if (whichPattern=="Singleton"){
            return new Singleton();
        }
        return null;

    }

}
