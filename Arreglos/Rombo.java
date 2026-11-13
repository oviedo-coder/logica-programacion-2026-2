package arreglos;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Rombo {

    public static void main(String[] args) {

        int n = Entrada.leerEntero("¿Cuántas filas tiene la mitad de arriba)");

        int [] estrellas = new int [2 * n - 1];

        for ( int i = 0; i < n ; i ++){
            estrellas[i] = 2 * i + 1;
            estrellas[estrellas.length -1 -i] = 2 * i + 1;
        }

        dibujar(estrellas, 2 * n - 1);
    }
    public static void dibujar ( int [] estrellas, int ancho){
        for (int fila = 0; fila < estrellas.length; fila++){
            int espacios = (ancho - estrellas[fila] / 2);

            for (int j = 0; j < espacios; j++){
                System.out.print(" ");
            }

            for ( int j = 0; j < estrellas[fila]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//.  *
//. ***
// *****
//  ***
//.  *
