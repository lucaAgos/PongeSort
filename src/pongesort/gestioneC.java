/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongesort;

import java.util.Random;

/**
 *
 * @author agostinelli.luca
 */
public class gestioneC {

    private String c;

    public String codice() {
        String caratteri = "ABCDEFGHILMNOPQRSTUVZWYKabcdefghilmnopqrstuvzkxwy";
        Random r = new Random();
        String randomString = "";
        int length = 1;
        char[] text = new char[length];

        for (int x = 0; x < text.length; x++) {
            text[x] = caratteri.charAt(r.nextInt(caratteri.length()));
            randomString += text[x];
        }
        return randomString;

    }

    public void setC(String c) {
        this.c = c;
    }



}
