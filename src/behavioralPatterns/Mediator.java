package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Mediator implements Pattern {

    PatternsService mediatorService;

    public Mediator() {

        usageMessage();

        mediatorService = new PatternsService();
        mediatorService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/mediatorDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/mediatorDemo/mediator_pattern_uml_diagram.jpg", "Mediator");
    }

    @Override
    public void usageMessage() {
        System.out.println("Mediator pattern is used to reduce communication" +
                " complexity between multiple objects or classes. " +
                "This pattern provides a mediator class which normally handles " +
                "all the communications between different classes and supports easy maintenance of the code by loose coupling.");
    }

}
