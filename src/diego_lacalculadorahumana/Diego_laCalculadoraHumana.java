/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego_lacalculadorahumana;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Diego_laCalculadoraHumana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 1;
        int num2 = 2;
        int num3 = 4;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; ) {
            int solucion = 0;
            int operacion = 0;
            int numeroRandom = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            int numero = (int) Math.floor(Math.random() * (num1 - num3) + num3);
            int numeroRandom1 = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            System.out.println("resuelve las siguientes operaciones:");
System.out.println(numero);
            if (numero == 1) {
                operacion = numeroRandom + numeroRandom1;
                System.out.println(numeroRandom + "+" + numeroRandom1);
                solucion = sc.nextInt();
                if (operacion == solucion) {
                    i++;
                }
            }
            if (numero == 2) {
                operacion = numeroRandom * numeroRandom1;
                System.out.println(numeroRandom + "x" + numeroRandom1);
                solucion = sc.nextInt();
                if (operacion == solucion) {
                    i++;
                }
            }
            if (numero == 3) {
                if(numeroRandom1>numeroRandom){
                     operacion = numeroRandom1 - numeroRandom;
                System.out.println(numeroRandom1 + "-" + numeroRandom);
                solucion = sc.nextInt();
                }else{
                operacion = numeroRandom - numeroRandom1;
                System.out.println(numeroRandom + "-" + numeroRandom1);
                solucion = sc.nextInt();
                }
                if (operacion == solucion) {
                    i++;
                }
            }/*
            if (numero == 4) {
                if(numeroRandom1%numeroRandom==0){
                     operacion = numeroRandom1 / numeroRandom;
                System.out.println(numeroRandom + "/" + numeroRandom1);
                solucion = sc.nextInt();
                }else{
                
                }
                if (operacion == solucion) {

                }

            }*/

        }

    }
}
