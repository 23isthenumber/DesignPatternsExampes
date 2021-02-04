package behavioralPatterns.templateDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class TemplatePatternDemo implements PatternDemo {
    public TemplatePatternDemo() {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        holdProgram();
    }
}
