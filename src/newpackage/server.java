/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agostinelli.luca
 */
public class server {

    public static void main(String[] args) {
      ArrayList<gestione> socket = new ArrayList();
         
            
        try {
            ServerSocket server = new ServerSocket(6666);  //stabilisce la porta
            System.out.println("Server è attivo e in ascolto");
          
            while (true) {
                Socket client = server.accept();
                System.out.println("connessione ricevuta");
                Thread Serverino = new Thread(new gestione(client));
               socket.add(new gestione(client));
                Serverino.start();
            }

        } catch (IOException ex) {
            Logger.getLogger(gestione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
