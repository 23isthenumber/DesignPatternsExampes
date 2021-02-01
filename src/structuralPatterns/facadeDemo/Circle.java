package structuralPatterns.facadeDemo;
//example from tutorialspoint.com
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
