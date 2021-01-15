package creationalPatterns.factory;

import java.io.IOException;

public class FactoryPatternDemo {

    public FactoryPatternDemo() {

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