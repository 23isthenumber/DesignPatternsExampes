package creationalPatterns;

import logic.Pattern;
import logic.PatternsService;

public class AbstractFactory implements Pattern {

    PatternsService abstractFactoryService;

    public AbstractFactory() {

        useageMessage();

        abstractFactoryService = new PatternsService();
        abstractFactoryService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/creationalPatterns/FactoryDemo",
                "https://raw.githubusercontent.com/" +
                        "23isthenumber/DesignPatternsExampes/" +
                        "main/src/creationalPatterns/FactoryDemo/" +
                        "factory_pattern_uml_diagram.jpg",
                "Factory");
    }

    @Override
    public void useageMessage() {
        System.out.println( "This is a factory of factories");
    }
}
