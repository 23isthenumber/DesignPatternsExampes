package creationalPatterns.builder;
//example from tutorialspoint.com
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
