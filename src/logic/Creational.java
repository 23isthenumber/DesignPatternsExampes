package logic;

import creationalPatterns.AbstractFactory;

import java.util.Scanner;


public class Creational implements PatternType {

    public Creational (){
        int CPChoice;
        Scanner CPInput= new Scanner(System.in);
        CreationalFactory creationalFactory = new CreationalFactory();
        Pattern pattern;

        do {
            useageMessage();

            CPChoice = CPInput.nextInt();

            if (CPChoice == 1) {
                pattern = creationalFactory.getPattern("Factory");
            }
            else if (CPChoice==2) {
                pattern=creationalFactory.getPattern("AbstractFactory");
            }
            else if (CPChoice==3){
                pattern=creationalFactory.getPattern("Singleton");
            }
            else if (CPChoice==4){
                pattern=creationalFactory.getPattern("Builder");
            }
            else if (CPChoice==5){
                pattern=creationalFactory.getPattern("Prototype");
            }
            else if (CPChoice==6){
                pattern=creationalFactory.getPattern("Singleton");
            }
            else if (CPChoice == 8) {
                System.exit(0);
            }
        }while (CPChoice!=7);
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
        System.out.println("3. Singleton");
        System.out.println("4. Builder");
        System.out.println("5. Prototype");
        System.out.println("6. Singleton");
        System.out.println("7. Ops! I didn't want Creational Patterns! Take me back!");
        System.out.println("8. End program.");
    }
}
