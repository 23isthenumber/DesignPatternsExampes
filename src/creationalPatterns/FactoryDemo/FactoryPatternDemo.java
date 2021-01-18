package creationalPatterns.factoryDemo;

import java.io.IOException;

public class FactoryPatternDemo {

    public FactoryPatternDemo() {

        System.out.println("This whole program code is based on factories, but if you want more:");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();

        System.out.println("Press ENTER to continue");
        try {
            System.in.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}