package creationalPatterns;


import logic.Pattern;
import logic.PatternsService;

public class Factory implements Pattern {
    PatternsService factoryService;

    public Factory() {

        usageMessage();

        factoryService = new PatternsService();
        factoryService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                "tree/main/src/creationalPatterns/factoryDemo",
                "https://raw.githubusercontent.com/" +
                        "23isthenumber/DesignPatternsExampes/" +
                        "main/src/creationalPatterns/factoryDemo/" +
                        "factory_pattern_uml_diagram.jpg", "Factory");
    }

    @Override
    public void usageMessage() {
        System.out.println("We use this pattern when when you can’t anticipate" +
                "what type of objects you’ll need to create or how to create them.");
    }
}
