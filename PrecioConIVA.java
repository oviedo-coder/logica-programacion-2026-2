package clase2;

import java.util.Scanner;

public class PrecioConIVA {
    public static void main(String[] args) {
        final double IVA = 0.19;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double precio = teclado.nextDouble();

        double valorIva = precio * IVA;
        double precioFinal = precio + valorIva;

        System.out.println("Valor del IVA: " + valorIva);
        System.out.println("Precio final: " + precioFinal);
    }
}