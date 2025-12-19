/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean condicion1 = true;
        boolean condicion2 = false;
        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[3][2];

        System.out.println("Ingrese los valores para matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese el valor para [%d][%d]\n", i, j);
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Ingrese los valores para matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Ingrese el valor para [%d][%d]\n", i, j);
                matrizB[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] < matrizB[i][j]) {
                    condicion1 = false;
                }

                if (matrizA[i][j] > matrizB[i][j]) {
                    condicion2 = true;
                }
            }
        }
        if (condicion1 && condicion2) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            System.out.println("\nLa matriz A no es mayor que la matriz B");
        }
    }

}
