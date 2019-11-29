/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exasergiolorenzo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slorenzorodriguez
 */
public class problema2 extends Thread{
    public problema2 (String str){
        super (str);
    }
    /**
     * @param args the command line arguments
     */
    
    public void run (){
        for (int i = 1; i < 26; i++){
        System.out.println(i + ": " + getName());
         
            try {
                problema2.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(problema2.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        
    }
         
        
        System.out.println("Acaba hilo: " + getName());
    }

    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        problema2 hilo1 = new problema2 ("a");
        problema2 hilo2 = new problema2 ("b");
        problema2 hilo3 = new problema2 ("c");
        
        
        hilo3.start();
        hilo3.join();
        hilo2.start();
        hilo2.join();
        hilo1.start();
        hilo1.join();
        
        System.out.println("Acaba hilo principal");
        
        
        
    }
    
}
