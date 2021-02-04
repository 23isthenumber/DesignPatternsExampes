package behavioralPatterns.commandDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class CommandPatternDemo implements PatternDemo {
    public CommandPatternDemo() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        holdProgram();
    }
}
