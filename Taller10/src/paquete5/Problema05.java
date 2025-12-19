/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String mensaje = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String nombre = estudiantes[i][j];
                String inicial_l = nombre.substring(0, 1);
                if (inicial_l.equals("S") || inicial_l.equals("P")
                        || inicial_l.equals("T")) {
                    mensaje = String.format("%s%s\n", mensaje, nombre);
                }
            }
        }

        System.out.println("Estudiantes con los nombres que inician en: S, P y "
                + "T:");
        System.out.println(mensaje);
    }
}
