package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Observer implements Pattern {

    PatternsService observerService;

    public Observer() {

        usageMessage();

        observerService = new PatternsService();
        observerService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/observerDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/observerDemo/observer_pattern_uml_diagram.jpg", "Observer");
    }

    @Override
    public void usageMessage() {
        System.out.println("Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.");
    }

}