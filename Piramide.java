package arreglos;

public class Piramide {

    public static void main(String[] args) {

        int filas = Entrada.leerEntero("¿Cuántas filas tiene la pirámide?"); // filas

        dibujarPiramide(filas);

    }
    public static void dibujarPiramide(int filas){

        for (int fila = 1; fila <= filas; fila++){ // fila
            for ( int esp =1; esp <= filas - fila; esp++){
                System.out.print(" ");
            }
            for ( int est = 1; est <= 2 * fila -1; est++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//.  *
//. ***
// *****