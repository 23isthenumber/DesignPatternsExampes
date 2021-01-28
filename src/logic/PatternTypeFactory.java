package logic;

public class PatternTypeFactory implements AbstractFactory{
    private static PatternTypeFactory instance = new PatternTypeFactory();

    private PatternTypeFactory (){

    }

    public static PatternTypeFactory getInstance(){
        return instance;

    }



    @Override
    public PatternType produce(String whatToProduce) {
        if (whatToProduce == "Creational") {
            return new Creational();
        }
        return null;
    }

}