/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] conteo_asistencias = new int[estudiantes.length];

        for (int i = 0; i < asistencia.length; i++) {
            int dias_asistidos = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j]) {
                    dias_asistidos++;
                }
            }

            conteo_asistencias[i] = dias_asistidos;

            System.out.printf("Estudiante:%s tiene %s asistencias ",
                     estudiantes[i], conteo_asistencias[i]);

            if (conteo_asistencias[i] == 5) {
                System.out.println("por lo tanto SI cumple con todas sus "
                        + "asistencias");
            } else {
                System.out.println("por lo tanto NO cumple con las asistencias");
            }
        }
    }
}
