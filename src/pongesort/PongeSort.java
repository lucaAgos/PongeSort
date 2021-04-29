/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongesort;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author agostinelli.luca
 */
public class PongeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket server = new Socket("127.0.0.1", 6666);
        gestioneC g = new gestioneC();
        String[] lista = new String[20];
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = g.codice();
        }
        
        g.setC(lista[0]);
        FileOutputStream FO = new FileOutputStream("t.tmp");
        ObjectOutputStream OS = new ObjectOutputStream(FO);
        PrintWriter scrittore = new PrintWriter(server.getOutputStream(), true);
        BufferedReader ricevi = new BufferedReader(new InputStreamReader(server.getInputStream()));
        OS.write(g);
        scrittore.println();
        
    }
    
}
