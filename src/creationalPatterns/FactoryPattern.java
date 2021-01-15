package creationalPatterns;

import creationalPatterns.factory.FactoryPatternDemo;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class FactoryPattern {

    public FactoryPattern() {

        Scanner FPInputScanner = new Scanner(System.in);
        int FPInput;

        System.out.println("We use this pattern when when you can’t anticipate " +
                "what type of objects you’ll need to create or how to create them.");
        do {
            System.out.println("Would you rather see an:");
            System.out.println("1. Github code example");
            System.out.println("2. Class diagram");
            System.out.println("3. Working demo of the example code");
            System.out.println("4. None of the above. Take be back to Creational Pattern choice " +
                    "using GO TO statement (Hello Dijkstra!).");

            FPInput=FPInputScanner.nextInt();

            if (FPInput == 1) {
                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.browse(new URI("https://github.com/23isthenumber/" +
                            "DesignPatternsExampes/tree/main/src/creationalPatterns/factory"));
                } catch (URISyntaxException | IOException e) {
                    e.printStackTrace();
                }
            } else if (FPInput == 2) {
                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.browse(new URI("https://raw.githubusercontent.com/23isthenumber/" +
                            "DesignPatternsExampes/main/src/creationalPatterns/" +
                            "factory/factory_pattern_uml_diagram.jpg"));
                } catch (URISyntaxException | IOException e) {
                    e.printStackTrace();
                }
            } else if (FPInput == 3) {
                new FactoryPatternDemo();
            }


        } while (FPInput!=4);
    }
}
