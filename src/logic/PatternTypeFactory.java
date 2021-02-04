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
        else if (whatToProduce== "Structural"){
            return new Structural();
        }
        else if (whatToProduce== "Behavioral"){
            return new Behavioral();
        }
        return null;
    }

}