package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Facade implements Pattern {

    PatternsService facadeService;

    public Facade() {

        usageMessage();

        facadeService = new PatternsService();
        facadeService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/facadeDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "facadeDemo/facade_pattern_uml_diagram.jpg", "Facade");
    }

    @Override
    public void usageMessage() {
        System.out.println("Facade pattern hides the complexities of the system " +
                "and provides an interface to the client using which the client " +
                "can access the system.");
    }

}
