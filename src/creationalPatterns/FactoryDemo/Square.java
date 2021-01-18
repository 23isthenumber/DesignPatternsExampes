package creationalPatterns.factoryDemo;
//example from tutorialspoint.com
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
