package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Bridge implements Pattern {



    PatternsService bridgeService;

    public Bridge() {

        usageMessage();

        bridgeService = new PatternsService();
        bridgeService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/bridgeDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/bridgeDemo/" +
                        "bridge_pattern_uml_diagram.jpg", "Bridge");
    }

    @Override
    public void usageMessage() {
        System.out.println("This pattern involves an interface which acts as a bridge " +
                "which makes the functionality of concrete classes independent from " +
                "interface implementer classes. ");
        System.out.println("Both types of classes can be altered " +
                "structurally without affecting each other.");
    }

}
