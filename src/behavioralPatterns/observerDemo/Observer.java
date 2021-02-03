package behavioralPatterns.observerDemo;
//example from tutorialspoint.com
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
