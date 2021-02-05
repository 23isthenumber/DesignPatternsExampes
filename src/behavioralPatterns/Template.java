package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Template implements Pattern {

    PatternsService templateService;

    public Template() {

        useageMessage();

        templateService = new PatternsService();
        templateService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/templateDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/behavioralPatterns/templateDemo/template_pattern_uml_diagram.jpg"
                , "Template");
    }

    @Override
    public void useageMessage() {
        System.out.println("In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. ");
    }

}