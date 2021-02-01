package creationalPatterns.builder;
//example from tutorialspoint.com
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}