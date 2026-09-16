package funcionesydecisiones;

import java.util.Scanner;

public class Entrada {
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return teclado.nextInt();
    }

    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        return teclado.nextDouble();
    }

    public static boolean leerBooleano(String mensaje) {
        System.out.print(mensaje);
        return teclado.nextBoolean();
    }
}
