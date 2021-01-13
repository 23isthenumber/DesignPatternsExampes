import creationalPatterns.CPIntroduction;

import java.util.Scanner;

public class DesignPatternsExamples {
    public static void main (String [] args){
        int patternChoice;


        System.out.println("There are three categories of design patterns.");
        System.out.println("Which one would you like to see?:");
        System.out.println("1. Creational Patterns");
        System.out.println("2. Structural Patterns");
        System.out.println("3. Behavioral Patterns");

        Scanner input = new Scanner(System.in);
        patternChoice=input.nextInt();

        if (patternChoice==1){
            new CPIntroduction();
        }

    }
}
