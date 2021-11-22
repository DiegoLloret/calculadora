/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego_lacalculadorahumana;

/**
 *
 * @author Admin
 */
public class Tiempo extends Thread{
    int tiempo = 0;
    
    @Override
    public void run(){
        while(!isInterrupted()) {  //repita mientras no se interrumpa el hilo.
            try {
                sleep(1000);
                tiempo++;
            } catch (InterruptedException ex) {
               // System.out.println("\nInterrumpido");
                interrupt();
            }
        }
    }
    
}
