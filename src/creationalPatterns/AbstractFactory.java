package creationalPatterns;

import logic.Pattern;
import logic.PatternsService;

public class AbstractFactory implements Pattern {

    PatternsService abstractFactoryService;

    public AbstractFactory() {

        useageMessage();

        abstractFactoryService = new PatternsService();
        abstractFactoryService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes" +
                        "/tree/main/src/creationalPatterns/abstractFactoryDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/creationalPatterns/" +
                        "abstractFactoryDemo/abstractfactory_pattern_uml_diagram.jpg",
                "AbstractFactory");
    }

    @Override
    public void useageMessage() {
        System.out.println( "This is a factory of factories");
    }
}
