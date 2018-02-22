/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jdominguezdominguez
 */
public class LerFicheiro {

    public void lerLineas() throws FileNotFoundException, IOException {
        File fich = new File("/home/local/DANIELCASTELAO/jdominguezdominguez/Escritorio/primeiro.txt");
        FileReader fr = new FileReader(fich);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }

}
