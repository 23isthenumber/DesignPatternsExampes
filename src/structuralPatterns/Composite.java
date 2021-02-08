package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Composite implements Pattern {

    PatternsService compositeService;

    public Composite() {

        usageMessage();

        compositeService = new PatternsService();
        compositeService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/compositeDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "compositeDemo/composite_pattern_uml_diagram.jpg"
                ,"Composite");
    }

    @Override
    public void usageMessage() {
        System.out.println("Composite pattern is used where we need to treat a " +
                "group of objects in similar way as a single object. " +
                "Composite pattern composes objects in term of a tree " +
                "structure to represent part as well as whole hierarchy.");
    }

}
