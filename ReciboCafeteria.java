package secuencialyfunciones;

import java.util.Scanner;

public class ReciboCafeteria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadCafes = ingresarEntero(teclado, "¿Cuántos cafés vas a comprar? ");
        double precioUnitario = ingresarReal(teclado, "¿Cuál es el precio de cada café? ");
        double total = calcularTotal(cantidadCafes, precioUnitario);
        String mensaje = generarMensaje(cantidadCafes, precioUnitario, total);
        mostrarMensaje(mensaje);
    }

    public static int ingresarEntero(Scanner teclado, String pregunta) {
        System.out.print(pregunta);
        return teclado.nextInt();
    }

    public static double ingresarReal(Scanner teclado, String pregunta) {
        System.out.print(pregunta);
        return teclado.nextDouble();
    }

    public static double calcularTotal(int cantidadCafes, double precioUnitario) {
        return cantidadCafes * precioUnitario;
    }

    public static String generarMensaje(int cantidadCafes, double precioUnitario, double total) {
        return "Compraste " + cantidadCafes + " cafés a $" + precioUnitario + " cada uno. Total a pagar: $" + total;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
