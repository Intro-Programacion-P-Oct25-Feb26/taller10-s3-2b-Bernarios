/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[5][6];
        double[][] matriz_resultante = new double[5][6];
        int multi;
        System.out.println("ingrese el multiplicador");
        multi = entrada.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese los valores a multiplicar en "
                        + "la posicion %s %s\n", i, j);
                matriz[i][j] = entrada.nextDouble();

            }
        }
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante[i].length; j++) {
                matriz_resultante[i][j] = matriz[i][j] * multi;
            }
        }
        System.out.println("Los valores ingresados son:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%s\t", matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("los valores resultantes son:");
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante[i].length; j++) {
                System.out.printf("%s\t", matriz_resultante[i][j]);
            }
            System.out.println("");
        }
    }
}
