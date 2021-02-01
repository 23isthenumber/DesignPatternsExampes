package structuralPatterns.decoratorDemo;
//example from tutorialspoint.com
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
