package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Visitor implements Pattern {

    PatternsService visitorService;

    public Visitor() {

        useageMessage();

        visitorService = new PatternsService();
        visitorService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/visitorDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/behavioralPatterns/visitorDemo/visitor_pattern_uml_diagram.jpg"
                , "Visitor");
    }

    @Override
    public void useageMessage() {
        System.out.println("In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, execution algorithm of element can vary as and when visitor varies. ");
    }

}