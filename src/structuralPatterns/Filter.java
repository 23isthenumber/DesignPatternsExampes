package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Filter implements Pattern {

    PatternsService filterService;

    public Filter() {

        usageMessage();

        filterService = new PatternsService();
        filterService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/filterDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "filterDemo/filter_pattern_uml_diagram.jpg", "Filter");
    }

    @Override
    public void usageMessage() {
        System.out.println("Filter pattern or Criteria pattern is a design " +
                "pattern that enables developers to filter a set of objects " +
                "using different criteria and chaining them in a decoupled way" +
                " through logical operations.");
    }

}
