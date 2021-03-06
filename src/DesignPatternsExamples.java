
import logic.AbstractFactory;
import logic.FactoryProducer;


import java.util.Scanner;

public class DesignPatternsExamples {
    public static void main (String [] args){
        int patternChoice;
        Scanner input = new Scanner(System.in);
        AbstractFactory abstractFactory;

        do {
            System.out.println("There are three categories of design patterns.");
            System.out.println("Which one would you like to see?:");
            System.out.println("1. Creational Patterns");
            System.out.println("2. Structural Patterns");
            System.out.println("3. Behavioral Patterns");
            System.out.println("4. Nothing. End program.");

            patternChoice = input.nextInt();

            if (patternChoice == 1) {
                abstractFactory = FactoryProducer.getFactory(
                        "PatternTypeFactory");
                abstractFactory.produce("Creational");
            } else if (patternChoice == 2) {
                abstractFactory = FactoryProducer.getFactory(
                        "PatternTypeFactory");
                abstractFactory.produce("Structural");
            }
            else if (patternChoice == 3) {
                abstractFactory = FactoryProducer.getFactory(
                        "PatternTypeFactory");
                abstractFactory.produce("Behavioral");
            }
        } while (patternChoice!=4);

    }

}
