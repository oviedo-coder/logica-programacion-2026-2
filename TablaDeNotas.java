package arreglos;

import javax.swing.*;

public class TablaDeNotas {

    // [fila][columna]
    // print:escribe y se queda en la misma linea  vs printLn: escribe y baja a la siguiente linea

    public static void main (String[] args){
        double [][] notas= {
                {4.0, 3.0, 5.0},
                {2.0, 3.0, 1.0},
                {5.0, 4.0, 3.0}
        };
        mostrarTabla(notas);
    }
    public static void mostrarTabla(double[][] notas){

        for (int fila = 0; fila < notas.length; fila++){ //1 -> 2 -> 3
            double suma = 0;

            System.out.print("Estudiante " + (fila + 1) + ": ");
            //                Estudiante 1:

            for (int col = 0; col < notas[fila].length; col++) { // 4, 3, 5
                System.out.print(notas[fila][col] + " ");
                suma += notas[fila][col];
            }

            double promedio = suma / notas[fila].length;
            System.out.println("| Promedio: " + promedio);
        }
    }
}