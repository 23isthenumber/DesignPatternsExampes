package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Decorator implements Pattern {


    PatternsService decoratorService;

    public Decorator() {

        useageMessage();

        decoratorService = new PatternsService();
        decoratorService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/decoratorDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "decoratorDemo/decorator_pattern_uml_diagram.jpg"
                , "Decorator");
    }

    @Override
    public void useageMessage() {
        System.out.println("Decorator pattern allows a user " +
                "to add new functionality to an existing object without " +
                "altering its structure.");
    }

}