package clase3;

import java.util.Scanner;

public class ComparadorDePrecios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto A: ");
        double precioA = teclado.nextDouble();

        System.out.print("Precio del producto B: ");
        double precioB = teclado.nextDouble();

        System.out.println("\n--- Comparador de Precios ---");
        System.out.println("¿El producto A es más barato? " + (precioA < precioB));
        System.out.println("¿El producto B es más barato? " + (precioB < precioA));
        System.out.println("¿Tienen el mismo precio? " + (precioA == precioB));
        System.out.println("¿Son diferentes? " + (precioA != precioB));
    }
}
