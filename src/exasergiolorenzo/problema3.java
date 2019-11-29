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
public class problema3 extends Thread{
        public static int contador=0;

    public problema3 (String str){
        super (str);
    }
    /**
     * @param args the command line arguments
     */
    
    
        public void run() {        
        if(contador==0){
            contador=1;
            problema3 hilo2 = new problema3("hilo 2");
            problema3 hilo3 = new problema3("hilo 3");
            
            hilo2.start();
            hilo3.start();
        }
        
        for(int i=1;i<25;i++){
            int numero = (int) (Math.random() * 250) + 1000;
            System.out.println(i + ": " + getName());
            try {
                sleep(numero);
            } catch (InterruptedException ex) {
                Logger.getLogger(problema3.class.getName()).log(Level.SEVERE, null, ex);
            }
            yield();
        }       
    }
    
    public static void main(String[] args) throws InterruptedException {
        problema3 hilo1 = new problema3("hilo 1");
        hilo1.start();
        
        
    
        
      
        
        
        
    }
    
}