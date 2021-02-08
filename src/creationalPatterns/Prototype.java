package creationalPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Prototype implements Pattern {

    PatternsService prototypeService;

    public Prototype() {

        usageMessage();

        prototypeService = new PatternsService();
        prototypeService.patternLogic(
                "https://github.com/23isthenumber/" +
                        "DesignPatternsExampes/tree/main/src/" +
                        "creationalPatterns/prototypeDemo",
                "https://raw.githubusercontent.com/" +
                        "23isthenumber/DesignPatternsExampes/" +
                        "main/src/creationalPatterns/prototypeDemo/" +
                        "prototype_pattern_uml_diagram.jpg", "Prototype");
    }

    @Override
    public void usageMessage() {
        System.out.println("According to tutorialspoint.com:" +
                "This pattern involves implementing a prototype interface" +
                " which tells to create a clone of the current object." +
                " This pattern is used when creation of object directly " +
                "is costly. For example, an object is to be created " +
                "after a costly database operation. We can cache the object, " +
                "returns its clone on next request and update the database " +
                "as and when needed thus reducing database calls.");
    }
}
