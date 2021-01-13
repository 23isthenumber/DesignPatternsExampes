package creationalPatterns;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FactoryPattern {
    // TO DO to musi być inaczej, wybor czy wyswietlic diagram, wlaczyc demo, czy url

    public FactoryPattern() {

        Desktop desktop=Desktop.getDesktop();

        try {
            desktop.browse(new URI("http://google.com"));
        }catch (URISyntaxException | IOException e){
            e.printStackTrace();
        }


    }

}
