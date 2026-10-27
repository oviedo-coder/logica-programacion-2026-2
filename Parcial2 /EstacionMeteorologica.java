package parcial2;

public class EstacionMeteorologica {

    public static void main(String[] args) {
        int lecturas = Entrada.leerEntero("¿Cuántas lecturas hay? ");

        analizarClima(lecturas);
    }

    public static void analizarClima(int lecturas) {
        boolean todasTempladas = true;
        boolean hayCalorExtremo = false;

        for (int i = 1; i <= lecturas; i++) {
            double temp = Entrada.leerDecimal("Temperatura " + i + " (°C): ");

            if (temp <= 20) {
                todasTempladas = false;
            }

            if (temp > 35) {
                hayCalorExtremo = true;
            }
        }

        if (hayCalorExtremo) {
            System.out.println("ALERTA: se registró calor extremo");
        } else if (todasTempladas) {
            System.out.println("Clima templado constante");
        } else {
            System.out.println("Clima variable");
        }
    }
}
