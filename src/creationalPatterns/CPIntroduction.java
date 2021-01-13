package creationalPatterns;

import java.util.Scanner;

public class CPIntroduction {
    private int CPChoice;
    private Scanner CPInput= new Scanner(System.in);

    public CPIntroduction() {
        System.out.println("According to tutorialspoint.com:");
        System.out.println("These design patterns provide a way to create objects " +
                "while hiding the creation logic, rather than instantiating objects directly ");
        System.out.println("using new operator. This gives program more flexibility " +
                "in deciding which objects need to be created for a given use case.");
        System.out.println("Chose which Creational Pattern would you like to see:");
        System.out.println("1. Factory pattern");

        CPChoice=CPInput.nextInt();

        if (CPChoice==1){
            new FactoryPattern();
        }
    }

}
