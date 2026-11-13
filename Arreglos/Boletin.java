package arreglos;

public class Boletin {

    public static void main(String[] args) {

        int estudiantes = leerPostivo("¿Cuántos estudiantes? ");
        int notasPorEstudiante = leerPostivo("¿Cuántas notas por estudiante? ");

        double [][] notas = new double[estudiantes][notasPorEstudiante];

        llenar(notas);
        promedioPorEstudiantes(notas);
        promedioPorNota(notas);
    }
    public static int leerPostivo(String mensaje){
        int numero = Entrada.leerEntero(mensaje);

        while ( numero <= 0){
            System.out.println("Debe ser mayor que 0. ");
            numero = Entrada.leerEntero(mensaje);
        }
        return numero;
    }

    public static double leerNotaValida(String mensaje) {
        double nota = Entrada.leerDecimal(mensaje);

        while (nota < 0 || nota > 5) {
            System.out.println("Nota inválida. Debe estar entre 0 y 5. ");
            nota = Entrada.leerDecimal(mensaje);
        }
        return nota;
    }
    public static void llenar(double[][] notas){
        for ( int fila = 0; fila < notas.length; fila++){ // 2= 0, 3, 4
            for (int col = 0; col < notas[fila].length; col++){
                notas[fila][col] = leerNotaValida("Nota" + (col + 1)  + "del estudiante " + (fila + 1) + ": ");
            }
        }
    }

    public static void promedioPorEstudiantes(double[][] notas) {
        for (int fila = 0; fila < notas.length; fila++) {
            double suma = 0;
            for (int col = 0; col < notas[fila].length; col++) {
                suma += notas[fila][col];
            }
            System.out.println("Promedio del estudiante " + (fila + 1) + ": " + suma / notas[fila].length);

        }
    }



    public static void promedioPorNota(double[][] notas){
        for ( int col = 0; col < notas[0].length; col++){
            double suma = 0;

            for (int fila = 0; fila < notas.length; fila++){
                suma += notas[fila][col];
            }
            System.out.println("Promedio de la nota " + (col + 1) + ": " + suma/ notas.length);
        }

    }
}
