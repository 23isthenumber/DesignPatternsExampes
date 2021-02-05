package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Command implements Pattern {

    PatternsService commandService;

    public Command() {

        useageMessage();

        commandService = new PatternsService();
        commandService.patternLogic(
                "https://github.com/23isthenumber/" +
                        "DesignPatternsExampes/tree/main/src/behavioralPatterns/" +
                        "commandDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/" +
                        "commandDemo/command_pattern_uml_diagram.jpg"
                , "Command");
    }

    @Override
    public void useageMessage() {
        System.out.println("A request is wrapped under an object as command " +
                "and passed to invoker object. " +
                "Invoker object looks for the appropriate object which can " +
                "handle this command and passes the command to the corresponding" +
                " object which executes the command.");
    }

}
