package logic;

import creationalPatterns.AbstractFactory;
import creationalPatterns.Factory;
import creationalPatterns.Singleton;


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
        return null;

    }

}
