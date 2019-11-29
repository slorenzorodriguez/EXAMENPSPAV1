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
public class problema1 extends Thread{
    public problema1 (String str){
        super (str);
    }
    /**
     * @param args the command line arguments
     */
    
    public void run (){
        for (int i = 1; i < 26; i++)
        System.out.println(i + ": " + getName());
         
        try {
            problema1.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(problema1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
   
        System.out.println("Acaba hilo: " + getName());
    }
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        problema1 hilo1 = new problema1 ("a");
        problema1 hilo2 = new problema1 ("b");
        problema1 hilo3 = new problema1 ("c");
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        hilo1.join();
        hilo2.join();
        hilo3.join();
        
        System.out.println("Acaba hilo principal");
        
        
        
    }
    
}
