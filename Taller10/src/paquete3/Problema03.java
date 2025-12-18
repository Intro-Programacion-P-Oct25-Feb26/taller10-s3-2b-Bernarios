/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        
    boolean[][] sensores = {
    {true, true, true, true, true, true},
    {true, false, true, false, true, false},
    {false, false, false, false, false, false},
    {true, true, false, true, true, false}
};
    int[] conteo = new int[sensores.length];
    for (int i = 0; i < sensores.length; i++) {
            int sensores_funcionales = 0;
            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j]) {
                    sensores_funcionales++;
                }
            }
    
}
}