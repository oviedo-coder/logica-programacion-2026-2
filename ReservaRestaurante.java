package repasoparcial;

public class ReservaRestaurante {

    public static double calcularDeposito(int personas, boolean esEntreSemana) {
        double deposito = personas * 10000;
        if (esEntreSemana) {
            return deposito * 0.8;
        } else {
            return deposito;
        }
    }

    public static void main(String[] args) {
        int numPersonas = Entrada.leerEntero("Número de personas: ");
        int diasAnticipacion = Entrada.leerEntero("Días de anticipación: ");
        boolean tieneAutorizacionGerente = Entrada.leerBooleano("¿Tiene autorización del gerente? (true/false): ");

        boolean grupoEstandar = numPersonas >= 2 && numPersonas <= 8 && diasAnticipacion >= 1;
        boolean grupoGrandeAutorizado = numPersonas > 8 && tieneAutorizacionGerente;
        boolean reservaAceptada = grupoEstandar || grupoGrandeAutorizado;

        System.out.println("¿Reserva aceptada? " + reservaAceptada);

        if (reservaAceptada) {
            boolean esEntreSemana = Entrada.leerBooleano("¿Es un día entre semana (lunes a jueves)? (true/false): ");
            double deposito = calcularDeposito(numPersonas, esEntreSemana);
            System.out.println("Valor del depósito: " + deposito);
        }
    }
}
