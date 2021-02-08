package creationalPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Singleton implements Pattern {
    PatternsService singletonService;

    public Singleton (){

        usageMessage();

        singletonService = new PatternsService();
        singletonService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/creationalPatterns/singletonDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/creationalPatterns/singletonDemo/" +
                        "singleton_pattern_uml_diagram.jpg",
                "Singleton");
    }

    @Override
    public void usageMessage() {
        System.out.println("According to tutorialspoint.com:");
        System.out.println("a single class which is responsible to create an " +
                "object while making sure that only single object gets created. " +
                "This class provides a way to access its only object which can be " +
                "accessed directly without need to instantiate the object of the class.");

    }
}
