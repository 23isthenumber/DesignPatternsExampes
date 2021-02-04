package logic;

import java.util.Scanner;

public class Behavioral implements PatternType {

    public Behavioral (){
        int BPChoice;
        Scanner BPInput= new Scanner(System.in);
        BehavioralFactory behavioralFactory = new BehavioralFactory();
        Pattern pattern;

        do {
            useageMessage();

            BPChoice = BPInput.nextInt();

            if (BPChoice == 1) {
                pattern = behavioralFactory.getPattern("Chain of " +
                        "Responsibility");
            }
            else if (BPChoice==2) {
                pattern=behavioralFactory.getPattern("Command");
            }
            else if (BPChoice==3){
                pattern=behavioralFactory.getPattern("Intepreter");
            }
            else if (BPChoice==4){
                pattern=behavioralFactory.getPattern("Iterator");
            }
            else if (BPChoice==5){
                pattern=behavioralFactory.getPattern("Mediator");
            }
            else if (BPChoice==6){
                pattern=behavioralFactory.getPattern("Memento");
            }
            else if (BPChoice==7){
                pattern=behavioralFactory.getPattern("Null object");
            }
            else if (BPChoice==8){
                pattern=behavioralFactory.getPattern("Observer");
            }
            else if (BPChoice==9){
                pattern=behavioralFactory.getPattern("State");
            }
            else if (BPChoice==10){
                pattern=behavioralFactory.getPattern("Strategy");
            }
            else if (BPChoice==11){
                pattern=behavioralFactory.getPattern("Template");
            }
            else if (BPChoice==12){
                pattern=behavioralFactory.getPattern("Visitor");
            }
            else if (BPChoice == 14) {
                System.exit(0);
            }
        }while (BPChoice!=13);
    }




    @Override
    public void useageMessage() {
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
