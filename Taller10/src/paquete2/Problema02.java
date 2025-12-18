/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int menores = 0;
        int[] adultos = new int[edades.length];

        for (int i = 0; i < edades.length; i++) {
            int contador= 0;
            
            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    menores++;
                } else {

                    contador++;
                }
            }
            adultos[i] = contador;
        }

        System.out.println("Total de menores de edad:" + menores);
        for (int i = 0; i < adultos.length; i++) {
            System.out.printf("Familia %s:Esta formada por %s adultos\n",
                    (i + 1), adultos[i]);
        }
    }
}
    
