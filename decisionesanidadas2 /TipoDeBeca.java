package decisionesanidadas;

public class TipoDeBeca {

    public static void main(String[] args) {
        double promedio = Entrada.leerDecimal("Promedio del estudiante: ");
        boolean esDeportista = Entrada.leerBooleano("¿Es deportista de alto rendimiento? (true/false): ");

        String beca = definirBeca(promedio, esDeportista);

        System.out.println("Resultado: " + beca);
    }

    public static String definirBeca(double promedio, boolean esDeportista) {
        String beca;

        if (promedio >= 4.5) {
            if (esDeportista) {
                beca = "Beca completa";
            } else {
                beca = "Beca del 75%";
            }
        } else if (promedio >= 4.0) {
            if (esDeportista) {
                beca = "Beca del 50%";
            } else {
                beca = "Beca del 25%";
            }
        } else {
            beca = "Sin beca";
        }

        return beca;
    }
}
