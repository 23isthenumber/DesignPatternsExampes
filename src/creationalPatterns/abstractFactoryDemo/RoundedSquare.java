package creationalPatterns.abstractFactoryDemo;
//example from tutorialspoint.com
public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
