/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;
import java.util.Scanner;
/**
 *
 * @author danielrios
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        boolean ide = true;
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("Ingrese los valores a multiplicar en la"
                        + " posicion %s %s\n", i, j);
                matrizX[i][j] = entrada.nextDouble();
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (matrizX[i][j]+1)*(matrizX[i][j]+1);
            }
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                double x = matrizX[i][j];
                matrizB[i][j] = x * x + 2 * x + 1  ;
            }
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    ide = false;
                }
            }
        }
        if (ide) {
            System.out.println("la identidad algebraica si se cumple");
        } else {
            System.out.println("la identidad algebraica no se cumple");
        }
        
        
    }
}
