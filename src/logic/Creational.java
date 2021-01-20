package logic;

import creationalPatterns.AbstractFactory;
import creationalPatterns.Factory;

import java.util.Scanner;


public class Creational implements PatternType {

    public Creational (){
        int CPChoice;
        Scanner CPInput= new Scanner(System.in);

        do {
            useageMessage();

            CPChoice = CPInput.nextInt();

            if (CPChoice == 1) {
                new Factory();
            }
            else if (CPChoice==2) {
                new AbstractFactory(); //TO DO
            }
            else if (CPChoice == 21) {
                System.exit(0);
            }
        }while (CPChoice!=20);
    }



    @Override
    public void useageMessage() {
        System.out.println("According to tutorialspoint.com:");
        System.out.println("These design patterns provide a way to create objects " +
                "while hiding the creation logic, rather than instantiating objects directly ");
        System.out.println("using new operator. This gives program more flexibility " +
                "in deciding which objects need to be created for a given use case.");
        System.out.println("Chose which Creational Pattern would you like to see:");
        System.out.println("1. Factory");
        System.out.println("2. Abstract Factory");
        System.out.println("20. Ops! I didn't want Creational Patterns! Take me back!");
        System.out.println("21. End program.");
    }
}
