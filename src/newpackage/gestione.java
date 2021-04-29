/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agostinelli.luca
 */
public class gestione implements Runnable {

    private Socket clientSocket;

    public gestione(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        String risposta;

        try {
            System.out.println("Server creato con successo");
            System.out.println("in attesa di richieste");

            System.out.println("Un client connesso!!!");

            PrintWriter scrittore = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader ricevi = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//legge gli output della client socket

            risposta = ricevi.readLine();
            System.out.println(risposta);

        } catch (IOException ex) {
            Logger.getLogger(gestione.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
