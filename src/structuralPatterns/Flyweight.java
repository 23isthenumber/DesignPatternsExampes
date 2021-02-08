package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Flyweight implements Pattern {

    PatternsService flyweightService;

    public Flyweight() {

        usageMessage();

        flyweightService = new PatternsService();
        flyweightService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/flyweightDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "flyweightDemo/flyweight_pattern_uml_diagram.jpg"
                , "Flyweight");
    }

    @Override
    public void usageMessage() {
        System.out.println("Flyweight pattern is primarily used to reduce " +
                "the number of objects created and to decrease memory " +
                "footprint and increase performance.");
    }

}