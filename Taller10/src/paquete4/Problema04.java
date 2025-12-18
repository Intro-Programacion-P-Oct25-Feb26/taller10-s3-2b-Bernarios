/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
       
        int filas = 3;
        int columnas = 2;
        
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        // 1. Leer y almacenar valores de Matriz A
        System.out.println("Ingreso de datos para Matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = leer.nextInt();
            }
        }

        // 2. Leer y almacenar valores de Matriz B
        System.out.println("\nIngreso de datos para Matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = leer.nextInt();
            }
        }

        // 3 y 4. Mostrar matrices
        System.out.println("\nMATRIZ A:");
        mostrarMatriz(matrizA);
        
        System.out.println("\nMATRIZ B:");
        mostrarMatriz(matrizB);

        // 5. Comparar matrices según las condiciones
        boolean siempreMayorOIgual = true;
        boolean existeUnoEstrictamenteMayor = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Condición 1: Si encontramos un valor menor, ya no cumple "A >= B"
                if (matrizA[i][j] < matrizB[i][j]) {
                    siempreMayorOIgual = false;
                }
                // Condición 2: Verificar si existe al menos uno mayor
                if (matrizA[i][j] > matrizB[i][j]) {
                    existeUnoEstrictamenteMayor = true;
                }
            }
        }

        // Evaluación final
        System.out.println("\nRESULTADO DE LA COMPARACIÓN:");
        if (siempreMayorOIgual && existeUnoEstrictamenteMayor) {
            System.out.println("La matriz A es mayor que la matriz B");
        } else {
            System.out.println("La matriz A no es mayor que la matriz B");
        }
    }

    // Método auxiliar para imprimir matrices
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
