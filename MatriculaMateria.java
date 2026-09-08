package clase3;

import java.util.Scanner;

public class MatriculaMateria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Promedio académico: ");
        double promedio = teclado.nextDouble();

        System.out.print("Créditos aprobados: ");
        int creditos = teclado.nextInt();

        boolean cumplePromedio = promedio >= 3.0;
        boolean cumpleCreditos = creditos >= 20;
        boolean puedeMatricular = cumplePromedio && cumpleCreditos;

        System.out.println("\n--- Matrícula de Materia ---");
        System.out.println("¿Cumple el promedio mínimo? " + cumplePromedio);
        System.out.println("¿Cumple los créditos mínimos? " + cumpleCreditos);
        System.out.println("¿Puede matricular la materia? " + puedeMatricular);
    }
}