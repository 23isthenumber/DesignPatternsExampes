package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Interpreter implements Pattern {

    PatternsService factoryService;

    public Interpreter() {

        usageMessage();

        factoryService = new PatternsService();
        factoryService.patternLogic(
                "https://github.com/23isthenumber/" +
                        "DesignPatternsExampes/tree/main/src/" +
                        "behavioralPatterns/interpreterDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/" +
                        "interpreterDemo/interpreter_pattern_uml_diagram.jpg"
                , "Interpreter");
    }

    @Override
    public void usageMessage() {
        System.out.println("Interpreter pattern provides a way to " +
                "evaluate language grammar or expression." +
                "This pattern is used in SQL parsing, symbol processing engine etc.");
    }

}
