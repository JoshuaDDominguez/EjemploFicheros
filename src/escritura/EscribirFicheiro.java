/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdominguezdominguez
 */
public class EscribirFicheiro {

    File fich;
    PrintWriter escribir;

    public void EscribirLineas() {
        try {
            fich = new File("frases.txt");
            escribir = new PrintWriter(new FileWriter(fich, true));
            escribir.println("Frase 1");
            escribir.println("Frase 2");
            escribir.println("Frase 3");

        } catch (FileNotFoundException ex) {
            System.out.println("Error de escritura");
        } catch (IOException ex) {
            System.out.println("Error");
        } finally {
            escribir.close();
        }
    }

}
