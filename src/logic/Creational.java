package logic;


public class Creational extends PatternType {

    public Creational (){
        

        CreationalFactory creationalFactory = new CreationalFactory();

        do {
            usageMessage();

            patternChoice = patternInput.nextInt();

            if (patternChoice == 1) {
                creationalFactory.getPattern("Factory");
            }
            else if (patternChoice==2) {
                creationalFactory.getPattern("AbstractFactory");
            }
            else if (patternChoice==3){
                creationalFactory.getPattern("Singleton");
            }
            else if (patternChoice==4){
                creationalFactory.getPattern("Builder");
            }
            else if (patternChoice==5){
                creationalFactory.getPattern("Prototype");
            }
            else if (patternChoice==6){
                creationalFactory.getPattern("Singleton");
            }
            else if (patternChoice == 8) {
                System.exit(0);
            }
        }while (patternChoice!=7);
    }




    @Override
    public void usageMessage() {
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
