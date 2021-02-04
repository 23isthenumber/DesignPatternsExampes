package logic;

import java.util.Scanner;

public class Structural implements PatternType {

    public Structural (){
        int SPChoice;
        Scanner SPInput= new Scanner(System.in);
        StructuralFactory structuralFactory = new StructuralFactory();
        Pattern pattern;

        do {
            useageMessage();

            SPChoice = SPInput.nextInt();

            if (SPChoice == 1) {
                pattern = structuralFactory.getPattern("Adapter");
            }
            else if (SPChoice==2) {
                pattern= structuralFactory.getPattern("Bridge");
            }
            else if (SPChoice==3){
                pattern=structuralFactory.getPattern("Composite");
            }
            else if (SPChoice==4){
                pattern=structuralFactory.getPattern("Decorator");
            }
            else if (SPChoice==5){
                pattern=structuralFactory.getPattern("Facade");
            }
            else if (SPChoice==6){
                pattern=structuralFactory.getPattern("Filter");
            }
            else if (SPChoice==7){
                pattern=structuralFactory.getPattern("Flyweight");
            }
            else if (SPChoice==8){
                pattern=structuralFactory.getPattern("Proxy");
            }
            else if (SPChoice == 10) {
                System.exit(0);
            }
        }while (SPChoice!=9);
    }




    @Override
    public void useageMessage() {
        System.out.println("According to tutorialspoint.com:");
        System.out.println("TThese design patterns concern class " +
                "and object composition.");
        System.out.println("Concept of inheritance is used to compose " +
                "interfaces and define ways to compose objects to " +
                "obtain new functionalities.");
        System.out.println("Chose which Structural Pattern would you like to see:");
        System.out.println("1. Adapter");
        System.out.println("2. Bridge");
        System.out.println("3. Composite");
        System.out.println("4. Decorator");
        System.out.println("5. Facade");
        System.out.println("6. Filter");
        System.out.println("7. Flyweight");
        System.out.println("8. Proxy");
        System.out.println("9. Ops! I didn't want Creational Patterns! Take me back!");
        System.out.println("10. End program.");
    }
}
