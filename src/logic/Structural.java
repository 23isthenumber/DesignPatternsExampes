package logic;

public class Structural extends PatternType {

    public Structural (){
        

        StructuralFactory structuralFactory = new StructuralFactory();


        do {
            usageMessage();

            patternChoice = patternInput.nextInt();

            if (patternChoice == 1) {
                structuralFactory.getPattern("Adapter");
            }
            else if (patternChoice==2) {
                structuralFactory.getPattern("Bridge");
            }
            else if (patternChoice==3){
                structuralFactory.getPattern("Composite");
            }
            else if (patternChoice==4){
                structuralFactory.getPattern("Decorator");
            }
            else if (patternChoice==5){
                structuralFactory.getPattern("Facade");
            }
            else if (patternChoice==6){
                structuralFactory.getPattern("Filter");
            }
            else if (patternChoice==7){
                structuralFactory.getPattern("Flyweight");
            }
            else if (patternChoice==8){
                structuralFactory.getPattern("Proxy");
            }
            else if (patternChoice == 10) {
                System.exit(0);
            }
        }while (patternChoice!=9);
    }




    @Override
    public void usageMessage() {
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
