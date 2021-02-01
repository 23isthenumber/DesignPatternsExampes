package creationalPatterns.builder;
//example from tutorialspoint.com
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}