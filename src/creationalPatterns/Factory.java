package creationalPatterns;


import logic.Pattern;
import logic.PatternsService;

public class Factory implements Pattern {
    PatternsService factoryService;

    public Factory() {

        useageMessage();

        factoryService = new PatternsService();
        factoryService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                "tree/main/src/creationalPatterns/FactoryDemo",
                "https://raw.githubusercontent.com/" +
                        "23isthenumber/DesignPatternsExampes/" +
                        "main/src/creationalPatterns/FactoryDemo/" +
                        "factory_pattern_uml_diagram.jpg", "Factory");
    }

    @Override
    public void useageMessage() {
        System.out.println("We use this pattern when when you can’t anticipate" +
                "what type of objects you’ll need to create or how to create them.");
    }
}
