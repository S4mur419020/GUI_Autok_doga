
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FajlFelosztas {
    public static void main(String[] args) {
         try {
            String sor = Files.readString(Path.of("fuvarok.txt"));
            System.out.println("beolvasott fájl tartralma:\n" + sor);
        } catch (IOException ex) {
            Logger.getLogger(FajlFelosztas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
