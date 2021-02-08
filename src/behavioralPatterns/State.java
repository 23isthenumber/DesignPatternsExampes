package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class State implements Pattern {

    PatternsService stateService;

    public State() {

        usageMessage();

        stateService = new PatternsService();
        stateService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/stateDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/behavioralPatterns/stateDemo/state_pattern_uml_diagram.jpg"
                , "State");
    }

    @Override
    public void usageMessage() {
        System.out.println("In State pattern a class behavior changes based on its state.");
    }

}