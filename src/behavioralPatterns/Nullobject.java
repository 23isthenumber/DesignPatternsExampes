package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Nullobject implements Pattern {

    PatternsService nullobjectService;

    public Nullobject() {

        usageMessage();

        nullobjectService = new PatternsService();
        nullobjectService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/nullobjectDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/behavioralPatterns/nullobjectDemo/null_pattern_uml_diagram.jpg"
                , "Nullobject");
    }

    @Override
    public void usageMessage() {
        System.out.println("a null object replaces check of NULL object instance. " +
                "Instead of putting if check for a null value, Null Object reflects a do nothing relationship. " +
                "Such Null object can also be used to provide default behaviour in case data is not available.");
    }

}
