package logic;

import creationalPatterns.Factory;

public class CreationalFactory {

    public Pattern getPattern (String whichPattern){

        if (whichPattern=="Factory"){
            return new Factory();
        }
        return null;

    }

}
