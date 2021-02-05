package behavioralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Memento implements Pattern {

    PatternsService mementoService;

    public Memento() {

        useageMessage();

        mementoService = new PatternsService();
        mementoService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/tree/main/src/behavioralPatterns/mementoDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/behavioralPatterns/mementoDemo/memento_pattern_uml_diagram.jpg"
                , "Memento");
    }

    @Override
    public void useageMessage() {
        System.out.println("Memento pattern is used to restore state" +
                " of an object to a previous state. " +
                "Memento pattern uses three actor classes. " +
                "Memento contains state of an object to be restored. " +
                "Originator creates and stores states in Memento objects " +
                "and Caretaker object is responsible to restore object state from Memento.");
    }

}