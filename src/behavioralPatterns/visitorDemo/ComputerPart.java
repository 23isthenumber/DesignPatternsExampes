package behavioralPatterns.visitorDemo;
//tutorialspoint.com
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
