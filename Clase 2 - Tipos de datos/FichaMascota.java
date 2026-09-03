package clase2;

import java.util.Scanner;

public class FichaMascota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre de la mascota: ");
        String nombre = teclado.nextLine();

        //también pueden poner el nombre , edad y o que quieran por defecto.

        System.out.print("Edad (en años): ");
        int edad = teclado.nextInt();

        System.out.print("Peso (en kg): ");
        double peso = teclado.nextDouble();

        System.out.println("--- Ficha de la mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");



    }
}
