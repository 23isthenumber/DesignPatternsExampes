package behavioralPatterns.nullobjectDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class NullPatternDemo implements PatternDemo {
    public NullPatternDemo() {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

        holdProgram();
    }
}
