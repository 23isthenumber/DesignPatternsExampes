package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Adapter implements Pattern {
    PatternsService adapterService;

    public Adapter() {

        useageMessage();

        adapterService = new PatternsService();
        adapterService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/structuralPatterns/adapterDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/structuralPatterns/adapterDemo/adapter_pattern_uml_diagram.jpg"
                , "Adapter");
    }

    @Override
    public void useageMessage() {
        System.out.println("Adapter pattern works as a bridge between two incompatible interfaces.");
    }
}
