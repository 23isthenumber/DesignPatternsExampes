package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Strategy implements Pattern {

    PatternsService strategyService;

    public Strategy() {

        useageMessage();

        strategyService = new PatternsService();
        strategyService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/strategyDemo",
                "https://raw.githubusercontent.com/23isthenumber/DesignPatternsExampes/main/src/behavioralPatterns/strategyDemo/strategy_pattern_uml_diagram.jpg"
                , "Strategy");
    }

    @Override
    public void useageMessage() {
        System.out.println("In Strategy pattern, a class behavior or its algorithm can be changed at run time. ");
    }

}
