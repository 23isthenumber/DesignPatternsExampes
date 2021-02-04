package creationalPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Builder implements Pattern {

    PatternsService builderService;

    public Builder() {

        useageMessage();

        builderService = new PatternsService();
        builderService.patternLogic(
                "https://github.com/23isthenumber/" +
                        "DesignPatternsExampes/tree/main/src/" +
                        "creationalPatterns/builder",
                "https://raw.githubusercontent.com/" +
                        "23isthenumber/DesignPatternsExampes/" +
                        "main/src/creationalPatterns/builder/" +
                        "builder_pattern_uml_diagram.jpg", "Builder");
    }

    @Override
    public void useageMessage() {
        System.out.println("According to tutorialspoint.com:" +
                "Builder pattern builds a complex object using " +
                "simple objects and using a step by step approach.");
    }
}
