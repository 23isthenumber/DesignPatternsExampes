package logic;

public class Behavioral extends PatternType {

    public Behavioral (){

        BehavioralFactory behavioralFactory = new BehavioralFactory();

        do {
            usageMessage();

            patternChoice = patternInput.nextInt();

            if (patternChoice == 1) {
                behavioralFactory.getPattern("ChainOfResponsibility");
            }
            else if (patternChoice==2) {
                behavioralFactory.getPattern("Command");
            }
            else if (patternChoice==3){
                behavioralFactory.getPattern("Intepreter");
            }
            else if (patternChoice==4){
                behavioralFactory.getPattern("Iterator");
            }
            else if (patternChoice==5){
                behavioralFactory.getPattern("Mediator");
            }
            else if (patternChoice==6){
                behavioralFactory.getPattern("Memento");
            }
            else if (patternChoice==7){
                behavioralFactory.getPattern("Nullobject");
            }
            else if (patternChoice==8){
                behavioralFactory.getPattern("Observer");
            }
            else if (patternChoice==9){
                behavioralFactory.getPattern("State");
            }
            else if (patternChoice==10){
                behavioralFactory.getPattern("Strategy");
            }
            else if (patternChoice==11){
                behavioralFactory.getPattern("Template");
            }
            else if (patternChoice==12){
                behavioralFactory.getPattern("Visitor");
            }
            else if (patternChoice == 14) {
                System.exit(0);
            }
        }while (patternChoice!=13);
    }




    @Override
    public void usageMessage() {
        System.out.println("According to tutorialspoint.com:");
        System.out.println("TThese design patterns are specifically" +
                " concerned with communication between objects.");
        System.out.println("Chose which Behavioral Pattern would you like to see:");
        System.out.println("1. Chain of Responsibility");
        System.out.println("2. Command");
        System.out.println("3. Interpreter");
        System.out.println("4. Iterator");
        System.out.println("5. Mediator");
        System.out.println("6. Memento");
        System.out.println("7. Null object");
        System.out.println("8. Observer");
        System.out.println("9. State");
        System.out.println("10. Strategy");
        System.out.println("11. Template");
        System.out.println("12. Visitor");
        System.out.println("13. Ops! I didn't want Creational Patterns! Take me back!");
        System.out.println("14. End program.");
    }
}
