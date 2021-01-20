package logic;

public class PatternTypeFactory implements AbstractFactory{



    @Override
    public PatternType produce(String whatToProduce) {
        if (whatToProduce == "Creational") {
            return new Creational();
        }
        return null;
    }

}