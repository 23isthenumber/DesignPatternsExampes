package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class ChainOfResponsibility implements Pattern {


    PatternsService chorService;

    public ChainOfResponsibility() {

        useageMessage();

        chorService = new PatternsService();
        chorService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/behavioralPatterns/chainOfResponsibilityDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/" +
                        "/chain_pattern_uml_diagram.jpg"
                , "ChainOfResponsibility");
    }

    @Override
    public void useageMessage() {
        System.out.println("Creates a chain of receiver objects for a request.");
    }

}
