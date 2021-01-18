package Logic;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class PatternsService {

    public void patternLogic (String usageMessage, String githubCodeURI, String diagramURI,
                              String whichDemo){
        Scanner inputScanner = new Scanner(System.in);
        int input;
        DemoFactory demoFactory;

        System.out.println(usageMessage); // TO DO style formating

        do {
            System.out.println("Would you rather see an:");
            System.out.println("1. Github code example");
            System.out.println("2. Class diagram");
            System.out.println("3. Working demo of the example code");
            System.out.println("4. None of the above. Take be back to pattern's choice " +
                    "using GO TO statement (Hello Dijkstra!).");

            input = inputScanner.nextInt();

            if (input == 1) {
                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.browse(new URI(githubCodeURI));
                } catch (URISyntaxException | IOException e) {
                    e.printStackTrace();
                }
            } else if (input == 2) {
                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.browse(new URI(diagramURI));
                } catch (URISyntaxException | IOException e) {
                    e.printStackTrace();
                }
            } else if (input == 3) {
                new DemoFactory(whichDemo);
            }


        } while (input != 4);
    }

}
