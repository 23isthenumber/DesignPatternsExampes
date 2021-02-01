package structuralPatterns.facadeDemo;
//example from tutorialspoint.com
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}