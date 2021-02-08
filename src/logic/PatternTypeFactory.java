package logic;

public class PatternTypeFactory implements AbstractFactory{
    private static final PatternTypeFactory instance = new PatternTypeFactory();

    private PatternTypeFactory (){

    }

    public static PatternTypeFactory getInstance(){
        return instance;

    }



    @Override
    public PatternType produce(String whatToProduce) {
        return switch (whatToProduce) {
            case "Creational" -> new Creational();
            case "Structural" -> new Structural();
            case "Behavioral" -> new Behavioral();
            default -> null;
        };
    }

}