package creationalPatterns.factoryDemo;
//example from tutorialspoint.com
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
