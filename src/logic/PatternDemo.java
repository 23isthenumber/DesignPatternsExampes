package logic;

import java.io.IOException;

public interface PatternDemo {

    default void holdProgram(){
        System.out.println("Press ENTER to continue");
        try {
            System.in.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
