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
public class Diego_laCalculadoraHumana extends Thread {

    /**
     * @param args the command line arguments
     */
   @Override
    public void run(){
        System.out.println("Empieza el concurso");
        Operaciones();
    }
        // TODO code application logic here
    public  void Operaciones() {
        int num1 = 1;
        int num2 = 50;
        int num3 = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8;) {
            int solucion = 0;
            int operacion = 0;
            int numeroRandom = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            int numero = (int) Math.floor(Math.random() * (num1 - num3) + num3);
            int numeroRandom1 = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            System.out.println("resuelve las siguientes operaciones:");
           
            if (numero == 1) {
                int res = 0;
                while (res == 0) {
                    operacion = numeroRandom + numeroRandom1;
                    System.out.println(numeroRandom + "+" + numeroRandom1);
                    solucion = sc.nextInt();
                    if (operacion == solucion) {
                        i++;
                        res++;
                    }
                }
            }
            if (numero == 2) {
                int res = 0;
                while (res == 0) {
                    operacion = numeroRandom * numeroRandom1;
                    System.out.println(numeroRandom + "x" + numeroRandom1);
                    solucion = sc.nextInt();
                    if (operacion == solucion) {
                        i++;
                        res++;
                    }
                }
            }
            if (numero == 3) {
                int res = 0;
                while (res == 0) {
                    if (numeroRandom1 > numeroRandom) {
                        operacion = numeroRandom1 - numeroRandom;
                        System.out.println(numeroRandom1 + "-" + numeroRandom);
                        solucion = sc.nextInt();
                    } else {
                        operacion = numeroRandom - numeroRandom1;
                        System.out.println(numeroRandom + "-" + numeroRandom1);
                        solucion = sc.nextInt();
                    }
                    if (operacion == solucion) {
                        i++;
                        res++;
                    }
                }
            }
            if (numero == 4) {
                int rep = 0;
                int res = 0;
                while (rep == 0) {
                    numeroRandom = (int) Math.floor(Math.random() * (num1 - num2) + num2);
                    numeroRandom1 = (int) Math.floor(Math.random() * (num1 - num2) + num2);

                    if (numeroRandom1 % numeroRandom == 0) {
                        while (res == 0) {
                            operacion = numeroRandom1 / numeroRandom;
                            System.out.println(numeroRandom1 + "/" + numeroRandom);
                            solucion = sc.nextInt();

                            if (operacion == solucion) {
                                i++;
                                res++;
                                rep++;

                            }
                        }
                    }
                }
            }

        }
    }
}
