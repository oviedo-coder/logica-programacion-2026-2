package ciclos;


public class ResumenDeNotas {

    public static void main(String[] args) {

        int total = Entrada.leerEntero("¿ Cuántos Estudiantes hay? ");

        mostrarResumen(total);

    }

    public static void mostrarResumen(int total) {

        double suma = 0;
        int aprobados = 0;

        for (int i = 0; i <= total; i++) {

            double nota = Entrada.leerDecimal("Nota del estudiante " + i + ": ");

            suma += nota;

            if (nota >= 3.0) {
                aprobados++;


            }

        }

        double promedio = suma / total;

        System.out.println(" Promedio del grupo : " + promedio);
        System.out.println(" Aprobados: " + aprobados + " de " + total);


    }
}
