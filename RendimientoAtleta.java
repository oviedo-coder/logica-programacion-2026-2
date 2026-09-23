package repasoparcial;

public class RendimientoAtleta {

    public static double promedioPruebas(double t1, double t2, double t3, double t4) {
        return (t1 + t2 + t3 + t4) / 4;
    }

    public static String clasificarRendimiento(double promedio) {
        if (promedio < 5) {
            return "Elite";
        } else if (promedio <= 8) {
            return "Competitivo";
        } else {
            return "Recreativo";
        }
    }

    public static void main(String[] args) {
        double t1 = Entrada.leerDecimal("Tiempo prueba 1 (min): ");
        double t2 = Entrada.leerDecimal("Tiempo prueba 2 (min): ");
        double t3 = Entrada.leerDecimal("Tiempo prueba 3 (min): ");
        double t4 = Entrada.leerDecimal("Tiempo prueba 4 (min): ");
        boolean esSeleccionDepartamental = Entrada.leerBooleano("¿Pertenece a la selección departamental? (true/false): ");

        double promedio = promedioPruebas(t1, t2, t3, t4);

        if (esSeleccionDepartamental) {
            promedio = promedio - 0.5;
        }

        String clasificacion = clasificarRendimiento(promedio);

        System.out.println("Promedio ajustado: " + promedio);
        System.out.println("Clasificación: " + clasificacion);
    }
}