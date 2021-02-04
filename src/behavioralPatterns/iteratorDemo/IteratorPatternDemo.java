package behavioralPatterns.iteratorDemo;

import logic.PatternDemo;

//example from tutorialspoint.com
public class IteratorPatternDemo implements PatternDemo {

    public IteratorPatternDemo() {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);

            holdProgram();
        }
    }
}