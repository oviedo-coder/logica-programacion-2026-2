package arreglos;

public class Triangulo {

    public static void main(String[] args) {

        int filas = Entrada.leerEntero("¿Cuántas filas tiene el triangulo?"); // 6

        dibujarTriangulo(filas);
    }
    public static void dibujarTriangulo(int filas){

        for (int i=1; i <= filas; i++){ // 1, 2, 3, 4 i=4
            for( int col = 1; col <=i; col++){ // * * * = 4
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//QUIERO ESTOOOOOOOOOOOOO
//*
//**
//***