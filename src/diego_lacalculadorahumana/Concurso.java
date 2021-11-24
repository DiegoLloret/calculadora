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
public class Concurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Tiempo temporizador=new Tiempo();
        Diego_laCalculadoraHumana preguntas= new Diego_laCalculadoraHumana();
        
        
        preguntas.start();
        temporizador.start();
                
        
        preguntas.join();
        temporizador.interrupt();
        System.out.println("Ganaste wey");
      
    }
    
}
