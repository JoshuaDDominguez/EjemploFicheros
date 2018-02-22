/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import lectura.LerFicheiro;
import escritura.EscribirFicheiro;

/**
 *
 * @author jdominguezdominguez
 */
public class ExemploFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        LerFicheiro ler = new LerFicheiro();
        EscribirFicheiro escribir = new EscribirFicheiro();
        escribir.EscribirLineas();
        //ler.lerLineas();
    }

}
