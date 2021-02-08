package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Iterator implements Pattern {

    PatternsService iteratorService;

    public Iterator() {

        usageMessage();

        iteratorService = new PatternsService();
        iteratorService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/iteratorDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/iteratorDemo/iterator_pattern_uml_diagram.jpg", "Iterator");
    }

    @Override
    public void usageMessage() {
        System.out.println("This pattern is used to get a way to access the elements of a collection object in " +
                "sequential manner without any need to know its underlying representation. ");
    }

}