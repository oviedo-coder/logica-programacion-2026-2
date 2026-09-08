package clase3;

import java.util.Scanner;

public class VerificadorEnvioGratis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Monto total de la compra: ");
        double monto = teclado.nextDouble();

        System.out.print("Puntos acumulados: ");
        int puntos = teclado.nextInt();

        boolean cumpleMonto = monto >= 100000;
        boolean cumplePuntos = puntos >= 500;
        boolean tieneEnvioGratis = cumpleMonto || cumplePuntos;

        System.out.println("\n--- Verificador de Envío Gratis ---");
        System.out.println("¿Cumple el monto mínimo? " + cumpleMonto);
        System.out.println("¿Cumple los puntos mínimos? " + cumplePuntos);
        System.out.println("¿Tiene envío gratis? " + tieneEnvioGratis);
    }
}
