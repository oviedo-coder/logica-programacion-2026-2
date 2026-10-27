package parcial2;

public class EntrenamientoCiclismo {

    public static void main(String[] args) {
        int vueltas = Entrada.leerEntero("¿Cuántas vueltas realizó? ");

        analizarEntrenamiento(vueltas);
    }

    public static void analizarEntrenamiento(int vueltas) {
        double total = 0;
        int rapidas = 0;

        for (int i = 1; i <= vueltas; i++) {
            double tiempo = Entrada.leerDecimal("Tiempo de la vuelta " + i + " (min): ");

            total += tiempo;

            if (tiempo < 3.0) {
                rapidas++;
            }
        }

        double promedio = total / vueltas;

        System.out.println("Tiempo total: " + total + " min");
        System.out.println("Promedio por vuelta: " + promedio + " min");
        System.out.println("Vueltas rápidas: " + rapidas);

        if (promedio <= 3.0) {
            System.out.println("Ritmo competitivo");
        } else {
            System.out.println("Debe mejorar el ritmo");
        }
    }
}