package creationalPatterns.abstractFactoryDemo;
//example from tutorialspoint.com
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
