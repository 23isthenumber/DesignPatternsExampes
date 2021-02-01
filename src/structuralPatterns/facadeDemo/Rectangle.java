package structuralPatterns.facadeDemo;
//example from tutorialspoint.com
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
