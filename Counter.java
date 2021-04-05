  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotpsitthread;

/**
 *
 * @author informatica
 */
public class Counter {
    
    private int count = 0;

    public synchronized void incrementa() {
        count++;
    }

    public synchronized void decrementa() {
        count--;
    }

    void stampaValoreFinale() {
        System.out.println("Il contatore è: " + count);
    }
}
